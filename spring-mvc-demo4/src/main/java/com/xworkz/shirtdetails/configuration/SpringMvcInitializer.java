package com.xworkz.shirtdetails.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {
	
	private String[] ServletMappings= {"/"};
	private Class[] servletConfigClasses= {SpringConfiguration.class};

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return ServletMappings;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	
	   configurer.enable();
	}

}
