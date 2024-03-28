package com.HAH.mvc.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.HAH.mvc.configuration.MVCConfig;
import com.HAH.mvc.configuration.RootConfig;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { MVCConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

//	Using AbstractDispatcherServletInitializer
//	@Override
//	protected WebApplicationContext createServletApplicationContext() {
//		var rootContext = new XmlWebApplicationContext();
//		rootContext.setConfigLocation("/WEB-INF/root-config.xml");
//		return rootContext;
//	}
//
//	@Override
//	protected WebApplicationContext createRootApplicationContext() {
//		var dispatcherServlet = new XmlWebApplicationContext();
//		dispatcherServlet.setConfigLocation("/WEB-INF/mvc-config.xml");
//		return dispatcherServlet;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}

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
