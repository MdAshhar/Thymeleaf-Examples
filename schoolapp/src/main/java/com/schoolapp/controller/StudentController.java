package com.schoolapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.schoolapp.entities.Student;
import com.schoolapp.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/viewdata")
	public String viewjsp() {
		return "create";	
	}
	@RequestMapping("/savedata")
	public String savedata(@ModelAttribute("student")Student s) {
		studentservice.savedata(s);
		return "create";
	}
//	@RequestMapping("/savedata")
//	public String savedata(@RequestParam("name")String name,@RequestParam("age")String age,@RequestParam("section")String section,@RequestParam("mobile")String mobile) {
//		Student s=new Student();
//		s.setName(name);
//		s.setAge(age);
//		s.setSection(section);
//		s.setMobile(mobile);
//		studentservice.savedata(s);
//		return "create";
//	}
		
	@RequestMapping("/listall")
	public String studentData(ModelMap model) {
		List<Student> stud = studentservice.studentData();
		model.addAttribute("stud", stud);
		return "viewStudentData";
	}
	@RequestMapping("/deletedata")
	public String deleteOneData(@RequestParam("bota")long bot, Model model) {
		studentservice.deleteOneData(bot);
		List<Student> stud = studentservice.studentData();
		model.addAttribute("stud", stud);
		return "viewStudentData";
	}
	
}
