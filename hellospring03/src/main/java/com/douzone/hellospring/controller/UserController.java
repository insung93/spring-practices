package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	//http://localhost:8080/hellospring03/user/join에서 가입하기 버튼 POST요청
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		/*
		 * 만일 n이라는 이름의 파라미터가 없는 경우 
		 * 400 Bad Request 에러가 발생한다.
		 */
		System.out.println(name);
		if(name==null) {
			name = "";
		}
		return "UserController.update()";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n",required=true, defaultValue="") String name,
							@RequestParam(value="a",required=true, defaultValue="0") int age) {

		System.out.println("---" + name + ":" + age);
		return "UserController.update()";
	}
}