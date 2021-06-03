package com.douzone.guestbook.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestbookRepository;
import com.douzone.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController {
	@Autowired
	private GuestbookRepository guestbookRepository;
	
	@RequestMapping("")
	public String main(Model model) {
		List<GuestbookVo>list = guestbookRepository.findAll();
		model.addAttribute("list",list);
		return "/WEB-INF/views/index.jsp";
	}
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String add(GuestbookVo vo, Model model) {
		System.out.println(model);
		guestbookRepository.insert(vo);
		System.out.println(model);
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete/{no}",method = RequestMethod.GET)
	public String delete(@PathVariable("no") String GuestbookNo, Model model) {
		System.out.println(model);
		model.addAttribute("no",GuestbookNo);
		System.out.println(model);
		return "/WEB-INF/views/deleteform.jsp";
	}
	@RequestMapping("/delete")
	public String delete(GuestbookVo vo, Model model) {
		System.out.println(model);
		guestbookRepository.delete(vo);
		return "redirect:/";
	}
}
