package com.thymeleafexm.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafController {
	//http://localhost:8080/variable_Expression
	@RequestMapping("/variable_Expression")
	public String variable_Expression(Model model){
		Student student= new Student(1, "Ashhar", "Morwa_Bazar", "ashhar759@gmail.com");
		model.addAttribute("student", student);
		model.addAttribute("user", "Ashhar Miya");
		return "variable_Expression";
	}
	//http://localhost:8080/selection_Expression
	@RequestMapping("/selection_Expression")
	public String selection_Expression(Model model) {
		Student student= new Student(1, "Ashhar", "Morwa_Bazar", "ashhar759@gmail.com");
		model.addAttribute("student", student);
		return "selection_Expression";
	}
	//http://localhost:8080/message_Expression
	@RequestMapping("/message_Expression")
	public String message_Expression() {
		return "message_Expression";
	}
	//http://localhost:8080/link-expression
	@RequestMapping("/link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 2);
		return "link_expression";
	}
	//http://localhost:8080/fragment-expression
	@RequestMapping("/fragment-expression")
	public String fragmentExpression() {
		return "fragment_expression";
	}
	//http://localhost:8080/if-unless
	@RequestMapping("/if-unless")
	public String ifUnless(Model model) {
		User u1= new User("Ashhar", "Admin","ashhar000000@gmail.com");
		User u2= new User("Arif", "User","arig@gmail.com");
		User u3= new User("Ashwin", "Admin","Ashwin@gmail.com");
		List<User> users=new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		model.addAttribute("users", users);
		return "if-unless";
	}
	//http://localhost:8080/switch-case
	@RequestMapping("/switch-case")
	public String switchCase(Model model) {
		User user= new User("Ashhar", "Admin","ashhar000000@gmail.com");
		model.addAttribute("user", user);
		return "switch-case";
		
	}


}
