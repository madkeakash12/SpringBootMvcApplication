package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public ModelAndView disWelcomeMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "This is Welcome Page..!");
		mav.setViewName("index");
		return mav;
		
	}

}
