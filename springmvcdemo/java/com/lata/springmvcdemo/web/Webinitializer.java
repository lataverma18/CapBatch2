package com.lata.springmvcdemo.web;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Webinitializer implements WebApplicationInitializer {
		public void onStartup(ServletContext arg0) throws ServletException 
		{
			AnnotationConfigWebApplicationContext webctx=new AnnotationConfigWebApplicationContext();
			
			webctx.register(MyConfig.class);
			
			webctx.setServletContext(arg0);
			
			ServletRegistration.Dynamic servlet=arg0.addServlet("dispatcher", new DispatcherServlet(webctx));
			
			servlet.addMapping("/");
			
		}
		
	}


