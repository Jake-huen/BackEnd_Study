package com.example.studentmanagement;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student studnet1 = new Student("Kim","Taeheon","taehuen7757@gmail.com");
//		studentRepository.save(studnet1);
//
//		Student student2 = new Student("Kim","Juyeong","kjy77777@naver.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Lee","Yunkyoung","kdj77777@naver.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Kim","DongSick","dskim77777@naver.com");
//		studentRepository.save(student4);
	}
}
