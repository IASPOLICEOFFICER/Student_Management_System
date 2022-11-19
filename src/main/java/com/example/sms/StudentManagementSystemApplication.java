package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository StudentRepository;
	@Override
	public void run(String... args) throws Exception {
			
		 	Student Student1 = new Student("Jone","Cena","cena@gmail.com");
		  	StudentRepository.save(Student1);
	    	
		  	Student Student2 = new Student("Tony","Stark", "stark123@gmail.com");
		  	StudentRepository.save(Student2);
			
			 Student Student3 = new Student("Uzair","Khan", "uk0162868@gmail.com");
			 StudentRepository.save(Student3);

			 Student Student4 = new Student("farhan","Khan", "fk959216@gmail.com");
			 StudentRepository.save(Student4);
			 
			 
			 Student Student5 = new Student("najmul","khan","najmul786@gmail.com");
			 StudentRepository.save(Student5);
			  
	}

}
