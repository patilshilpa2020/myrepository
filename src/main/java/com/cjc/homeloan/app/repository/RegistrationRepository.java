package com.cjc.homeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.homeloan.app.model.CustomerRegistration;

public interface RegistrationRepository extends JpaRepository<CustomerRegistration, Integer>{

}
