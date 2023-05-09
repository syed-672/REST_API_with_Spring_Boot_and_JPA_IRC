package com.spring.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.loan.model.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel,String>{
   void deleteByPassword(String password);
}
