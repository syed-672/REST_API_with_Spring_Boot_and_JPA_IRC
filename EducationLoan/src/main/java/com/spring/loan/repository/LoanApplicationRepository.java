package com.spring.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.loan.model.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel,Integer>{
	
}
