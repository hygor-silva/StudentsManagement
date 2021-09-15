package br.com.myprojects.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.myprojects.StudentManagement.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long>{
	
	

}
