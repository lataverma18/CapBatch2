package com.lata.springmvcdemo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.lata.springmvcdemo.controllers","com.lata.springmvcdemo.dao"})
public class MyConfig {
	
	@Bean
	public InternalResourceViewResolver getView()
	{
		InternalResourceViewResolver ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/views/");
		ivr.setSuffix(".jsp");
		return ivr;
	}

}
