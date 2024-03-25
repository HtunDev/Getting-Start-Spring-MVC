package com.HAH.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class StudentController {

	@GetMapping
	public String greeting() {
		return "index";
	}
}
