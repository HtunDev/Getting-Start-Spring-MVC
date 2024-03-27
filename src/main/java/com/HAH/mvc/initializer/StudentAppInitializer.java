package com.HAH.mvc.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class StudentAppInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

		// Register Dispatcher Servlet
		var ds = new DispatcherServlet();
		ds.setContextConfigLocation("WEB-INF/mvc-config.xml");
		var registerDS = ctx.addServlet("dispatcher", ds);

		// Mapping Servlet
		registerDS.addMapping("/");
		registerDS.setLoadOnStartup(1);

		// Set Context Paramter
		ctx.setInitParameter("contextConfigLocation", "WEB-INF/root-config.xml");

		// Application Context
		var contextLoader = new ContextLoaderListener();
		ctx.addListener(contextLoader);
	}

}
