package com.cts.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver resolver() 
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver(); 
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	@Bean 
	public MessageSource messageSource() {
			ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
			messageSource.setBasename("messages");
		
		return messageSource;
		
	}
}
