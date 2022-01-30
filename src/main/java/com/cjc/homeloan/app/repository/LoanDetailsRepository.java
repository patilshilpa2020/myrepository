package com.cjc.homeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.homeloan.app.model.LoanDetails;

public interface LoanDetailsRepository extends JpaRepository<LoanDetails, Integer> {

}
