package com.sceddinfo.sms.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sceddinfo.sms.rest.dto.PermissionDTO;
import com.sceddinfo.sms.rest.entity.Permission;
import com.sceddinfo.sms.rest.exception.EntityNotFoundException;

@Service
public interface PermissionServiceI {

	public PermissionDTO saveOrupdate(PermissionDTO permDTO);

	public List<PermissionDTO> list();

	public PermissionDTO getPermission(String permId) throws EntityNotFoundException;

	public void deleteById(String id);

	public void delete(Permission perm);

}