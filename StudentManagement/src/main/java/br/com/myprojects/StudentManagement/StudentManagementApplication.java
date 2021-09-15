package br.com.myprojects.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.myprojects.StudentManagement.entity.Student;
import br.com.myprojects.StudentManagement.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository StudentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Student std1 = new Student("Hygor", "Silva", "Hygor@gmail.com");
		StudentRepository.save(std1);
		
		Student std2 = new Student("André", "Ribeiro", "Andre@gmail.com");
		StudentRepository.save(std2);
		
		Student std3 = new Student("Milson", "Fábio", "Fábio@gmail.com");
		StudentRepository.save(std3);
		
	}

}
