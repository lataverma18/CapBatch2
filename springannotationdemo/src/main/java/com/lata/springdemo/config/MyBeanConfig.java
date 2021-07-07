package com.lata.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.lata.springdemo.beans.Address;
import com.lata.springdemo.beans.Employee;

@Configuration
@ComponentScan("com.lata.springdemo.beans")
@ComponentScan("com.lata.springdemo.dao")
@ComponentScan("com.lata.springdemo.services")
@ComponentScan("com.lata.springdemo.controller")
public class MyBeanConfig {

	@Bean(initMethod="initMethod",destroyMethod="beforeDestroy")
	@Scope("prototype")
	public Employee employee()
	{
		return new Employee();
	}
	
	@Bean("add1")
	public Address address()
	{
		return new Address();
	}
}
