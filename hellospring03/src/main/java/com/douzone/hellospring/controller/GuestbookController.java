package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 
 * RequestMapping
 * 클래스(타입) 단독 매핑
 * 
 */

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:list";
	}
	//http://localhost:8080/hellospring03/guestbook/list
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "GuestbookController:delete";
	}
	//http://localhost:8080/hellospring03/guestbook/delete
	
}
