package com.HAH.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LegacyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		var mv = new ModelAndView("legacy-style");
		mv.getModel().put("message", "Hello from legacy controller old style");
		return mv;
	}

}
