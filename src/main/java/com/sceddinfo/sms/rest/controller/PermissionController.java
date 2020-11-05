package com.sceddinfo.sms.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sceddinfo.sms.rest.dto.PermissionDTO;
import com.sceddinfo.sms.rest.entity.Permission;
import com.sceddinfo.sms.rest.service.PermissionServiceI;

@RestController
public class PermissionController {

	@Autowired
	PermissionServiceI permServiceI;

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public ResponseEntity<PermissionDTO> getSaved(@RequestBody PermissionDTO permDTO) {
		System.out.println("*-*-*-*-" + permDTO.getPermissionId() + "*-*-*-*-*-*-*-*-*");
		PermissionDTO permissionDTO = permServiceI.saveOrupdate(permDTO);
		return new ResponseEntity<PermissionDTO>(permissionDTO, HttpStatus.CREATED);
	}
	// @PostMapping("/saveOrUpdate")
	/*
	 * public ResponseEntity<Void> addArticle(@RequestBody Permission perm,
	 * UriComponentsBuilder builder) { boolean saveOrupdate =
	 * permServiceI.saveOrupdate(perm); if (saveOrupdate == false) { return new
	 * ResponseEntity<Void>(HttpStatus.CONFLICT); } HttpHeaders headers = new
	 * HttpHeaders();
	 * headers.setLocation(builder.path("/saveOrUpdate/{id}").buildAndExpand(perm.
	 * getPermission_Id()).toUri()); return new ResponseEntity<Void>(headers,
	 * HttpStatus.CREATED); }
	 */

	/*
	 * @GetMapping(value = "/getPer/{Id}") public PermissionRespVO
	 * getPermissions(@PathVariable(value = "Id") String pId) { PermissionRespVO
	 * permVo = new PermissionRespVO(); Optional<Permission> permission =
	 * permServiceI.getPermission(pId);
	 * permVo.setRespCode(CommonConstants.RESP_CODE);
	 * permVo.setRespDesc(CommonConstants.RESP_DESC); permVo.setOnePerm(permission);
	 * return permVo; }
	 * 
	 * @GetMapping(value = "/getAll") public PermissionRespVO getAll() {
	 * PermissionRespVO permVo = new PermissionRespVO(); List<Permission>
	 * listPermission = permServiceI.list();
	 * permVo.setRespCode(CommonConstants.RESP_CODE);
	 * permVo.setRespDesc(CommonConstants.RESP_DESC);
	 * permVo.setListPVO(listPermission); return permVo; }
	 * 
	 * @DeleteMapping(value = "/delePerm/{id}") public PermissionRespVO
	 * deleteStudent(@PathVariable String id) { permServiceI.deleteById(id);
	 * PermissionRespVO permVo = new PermissionRespVO();
	 * permVo.setRespCode(CommonConstants.RESP_CODE);
	 * permVo.setRespDesc(CommonConstants.RESP_DESC); return permVo; }
	 * 
	 * @RequestMapping(value = "/delete", method = RequestMethod.POST) public
	 * PermissionRespVO deleteStudent(@RequestBody Permission per) {
	 * permServiceI.delete(per); PermissionRespVO permVo = new PermissionRespVO();
	 * permVo.setRespCode(CommonConstants.RESP_CODE);
	 * permVo.setRespDesc(CommonConstants.RESP_DESC); return permVo; }
	 */
}