package com.HAH.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HAH.mvc.service.StudentService;

@Controller
@RequestMapping("/hello")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping
	public String greeting(Model model) {
		model.addAttribute("message", service.getMessage());
		return "index";
	}
}
