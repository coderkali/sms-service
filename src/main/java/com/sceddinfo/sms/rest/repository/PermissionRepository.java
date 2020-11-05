package com.sceddinfo.sms.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sceddinfo.sms.rest.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {

}