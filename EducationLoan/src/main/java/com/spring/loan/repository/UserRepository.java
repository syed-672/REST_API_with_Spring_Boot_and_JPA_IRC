package com.spring.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.loan.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer>{
	

}
