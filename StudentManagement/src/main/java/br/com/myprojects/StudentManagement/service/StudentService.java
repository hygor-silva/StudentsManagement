package br.com.myprojects.StudentManagement.service;

import java.util.List;

import br.com.myprojects.StudentManagement.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
}
