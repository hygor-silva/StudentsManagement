package br.com.myprojects.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.myprojects.StudentManagement.entity.Student;


public interface StudentRepository extends JpaRepository <Student,Long>{
	
	

}
