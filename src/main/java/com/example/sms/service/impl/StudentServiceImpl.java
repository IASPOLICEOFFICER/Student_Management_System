package com.example.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository StudentRepository;
	

	public StudentServiceImpl(com.example.sms.repository.StudentRepository studentRepository) {
		super();
		StudentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return StudentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {	
		return StudentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {		
		return StudentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return StudentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		StudentRepository.deleteById(id);
	}

}
