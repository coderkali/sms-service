package com.sceddinfo.sms.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sceddinfo.sms.rest.entity.Registration;

@Repository
public interface RegistrationRepositoryI extends JpaRepository<Registration, Long> {

}
