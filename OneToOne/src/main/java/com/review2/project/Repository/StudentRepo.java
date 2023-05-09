package com.review2.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.Model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}