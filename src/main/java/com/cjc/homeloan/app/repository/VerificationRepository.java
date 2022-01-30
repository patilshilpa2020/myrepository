package com.cjc.homeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.homeloan.app.model.Verification;

public interface VerificationRepository extends JpaRepository<Verification, Integer> {

}
