package com.spring.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.loan.model.LoginModel;

public interface LoginRepository extends JpaRepository <LoginModel,String>{
    void deleteByPassword(String password);
}
