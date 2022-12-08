package com.schoolapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolapp.entities.Student;
import com.schoolapp.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	
	
	@Override
	public void savedata(Student s) {
		studRepo.save(s);

	}
	@Override
	public List<Student> studentData() {
		List<Student> stud = studRepo.findAll();
		return stud;
	}
	@Override
	public void deleteOneData(long bot) {
		studRepo.deleteById(bot);
		
	}

}
