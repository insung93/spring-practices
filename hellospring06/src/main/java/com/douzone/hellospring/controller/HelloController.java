package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	//http://localhost:8080/hellospring03/hello
	
	
	@RequestMapping("/hello2")
	public String hello2(String name) {
		System.out.println(name);
		return "/WEB-INF/views/hello2.jsp";
	}
	//http://localhost:8080/hellospring03/hello2?name=??
	
	
	@RequestMapping("/hello3")
	public ModelAndView hello3(String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		mav.setViewName("/WEB-INF/views/hello3.jsp");
		return mav;
	}
	//http://localhost:8080/hellospring03/hello3?name=??
	
	
	@RequestMapping("/hello4")
	public String hello4(String name, Model model) {
		model.addAttribute("name",name);
		return "/WEB-INF/views/hello4.jsp";
	}
	//http://localhost:8080/hellospring03/hello4?name=aaaa
	
	
}