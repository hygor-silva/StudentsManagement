package br.com.myprojects.StudentManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.myprojects.StudentManagement.entity.Student;
import br.com.myprojects.StudentManagement.repository.StudentRepository;
import br.com.myprojects.StudentManagement.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	
}
