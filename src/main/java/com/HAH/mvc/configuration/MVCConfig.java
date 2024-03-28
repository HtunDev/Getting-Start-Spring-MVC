package com.HAH.mvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.HAH.mvc.controller.LegacyController;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.HAH.mvc.controller", "com.HAH.mvc.service" })
public class MVCConfig implements WebMvcConfigurer {

//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		registry.jsp().prefix("/views/").suffix(".jsp");
//	}

	@Bean
	public ViewResolver jspViewResolver() {
		return new InternalResourceViewResolver("/views/", ".jsp");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/hello");
	}

	@Bean("/legacy")
	public LegacyController getLegacyController() {
		return new LegacyController();
	}
}
