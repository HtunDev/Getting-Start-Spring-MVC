package com.HAH.mvc.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		var rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/root-config.xml");
		return rootContext;
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		var dispatcherServlet = new XmlWebApplicationContext();
		dispatcherServlet.setConfigLocation("/WEB-INF/mvc-config.xml");
		return dispatcherServlet;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

//  This is webApplicationInitializer
//	@Override
//	public void onStartup(ServletContext ctx) throws ServletException {
//
//		// Register Dispatcher Servlet
//		var ds = new DispatcherServlet();
//		ds.setContextConfigLocation("WEB-INF/mvc-config.xml");
//		var registerDS = ctx.addServlet("dispatcher", ds);
//
//		// Mapping Servlet
//		registerDS.addMapping("/");
//		registerDS.setLoadOnStartup(1);
//
//		// Set Context Paramter
//		ctx.setInitParameter("contextConfigLocation", "WEB-INF/root-config.xml");
//
//		// Application Context
//		var contextLoader = new ContextLoaderListener();
//		ctx.addListener(contextLoader);
//	}

}
