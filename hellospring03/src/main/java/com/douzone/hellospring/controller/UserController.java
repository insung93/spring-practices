package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 
 *  @RequestMapping
 *  클래스 + 핸들러(메소드)
 *  
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String joinform() {
		return "/WEB-INF/views/join.jsp";
	}
	//http://localhost:8080/hellospring03/user/join
	
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
	//http://localhost:8080/hellospring03/user/join에서 POST요청
}