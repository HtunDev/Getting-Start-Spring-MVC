package com.HAH.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class StudentController {

	@GetMapping
	public String greeting(Model model) {
		model.addAttribute("message", "This message from student controller.");
		return "index";
	}
}
