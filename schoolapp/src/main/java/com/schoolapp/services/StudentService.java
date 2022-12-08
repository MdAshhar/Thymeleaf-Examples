package com.schoolapp.services;

import java.util.List;

import com.schoolapp.entities.Student;

public interface StudentService {
	public void savedata(Student s);
	public List<Student> studentData();
	public void deleteOneData(long bot);
}
