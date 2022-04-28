package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.StudentModel;



public interface StudentRepository extends JpaRepository<StudentModel,String> {

}
