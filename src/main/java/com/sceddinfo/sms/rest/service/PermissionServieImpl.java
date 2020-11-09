package com.sceddinfo.sms.rest.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceddinfo.sms.rest.dto.PermissionDTO;
import com.sceddinfo.sms.rest.entity.Permission;
import com.sceddinfo.sms.rest.exception.EntityNotFoundException;
import com.sceddinfo.sms.rest.repository.PermissionRepository;
import com.sceddinfo.sms.rest.util.ModelMapperImpl;

@Service
public class PermissionServieImpl implements PermissionServiceI {

	@Autowired
	PermissionRepository permServiceRepo;

	@Autowired
	ModelMapperImpl modelmapper;

	@Override
	public PermissionDTO getPermission(String permId) throws EntityNotFoundException {
		return (PermissionDTO) modelmapper.convert(
				permServiceRepo.findById(permId).orElseThrow(EntityNotFoundException::new), PermissionDTO.class);

	}

	@Override
	public PermissionDTO saveOrupdate(PermissionDTO perm) {
		Permission convertPerm = (Permission) modelmapper.convert(perm, Permission.class);
		Permission save = permServiceRepo.save(convertPerm);
		return (PermissionDTO) modelmapper.convert(save, PermissionDTO.class);
	}

	@Override
	public List<PermissionDTO> list() {
		return permServiceRepo.findAll().stream().map(p -> (PermissionDTO) modelmapper.convert(p, PermissionDTO.class))
				.collect(Collectors.toList());
	}

	@Override
	public void deleteById(String id) {
		permServiceRepo.deleteById(id);
	}

	@Override
	public void delete(Permission perm) {
		permServiceRepo.delete(perm);

	}

}