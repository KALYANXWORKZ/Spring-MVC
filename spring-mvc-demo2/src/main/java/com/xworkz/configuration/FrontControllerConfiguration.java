package com.xworkz.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling  getServletConfigClasses");
		return new Class[] {SpringConfiguration.class};
		
	}

	@Override
	protected String[] getServletMappings() {

		System.out.println("Calling  getServletMappings");
		return new String[] {"*.do"};
	}

}
