package com.book_shop.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.book_shop.Services.BookService;
import com.book_shop.entities.Book;

@Controller
public class BookController {
	@Autowired
	private BookService serv;
	
	@RequestMapping("/viewAllData")
	public String viewOneData() {
		return "create";
	}
	@RequestMapping("/saveData")
	public String saveOneData(@ModelAttribute("book")Book b,ModelMap model){
		serv.saveOneData(b);
		model.addAttribute("msg", "Record is saved");
		return "create";
	}
	@RequestMapping("/listall")
	public String listAllData(ModelMap model) {
		List<Book> read = serv.listAllData();
		model.addAttribute("read", read);
		return "listall";	
	}
	@RequestMapping("/deleteOneData")
	public String deleteOneData(@RequestParam("id")Long id,ModelMap model) {
		serv.deleteOneData(id);
		List<Book> read = serv.listAllData();
		model.addAttribute("read", read);
		return"listall";
	}
	@RequestMapping("/updateOneData")
	public String updatedata(@RequestParam("lallu")long id, Model model) {
		Book page = serv.findById(id);
		model.addAttribute("page", page);
		return"update";
	}
	@RequestMapping("/updateData")
	public String updateOneData(@ModelAttribute("book")Book b,ModelMap model){
		serv.saveOneData(b);
		List<Book> read = serv.listAllData();
		model.addAttribute("read", read);
		return "listall";	
	
	}

}
