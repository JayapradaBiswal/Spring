package com.test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeControler
{
	
	public WelcomeControler() {
		super();
	}
	@RequestMapping("/welcome")
 public ModelAndView sayWelcome()
{
		System.out.println("welcome method called");
		return new ModelAndView("index.jsp");
}
	@RequestMapping("/login")
	 public ModelAndView login(@RequestParam String userName,@RequestParam String password)
	 {
		ModelAndView mv=new ModelAndView("data.jsp");
		mv.addObject("un",userName);
		mv.addObject("pass",password);
		return mv;
	 }
}
