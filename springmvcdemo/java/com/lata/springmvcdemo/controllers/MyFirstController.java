package com.lata.springmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {
	
	@RequestMapping("/greet")
	public ModelAndView greet()
	{
		String str="Hello Everyone!!!";
		ModelAndView mv=new ModelAndView("mygreetpage");
		mv.addObject("greetMsg",str);
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView home()
	{
		String str="Home Page!!!";
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("firstMsg",str);
		return mv;
	}

}
