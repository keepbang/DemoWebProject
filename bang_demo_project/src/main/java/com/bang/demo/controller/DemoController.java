package com.bang.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@Value("${server.serverNm}")
	private String serverNm;

	@GetMapping(value="/index.do")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		view.addObject("serverNm", serverNm);
		return view;
	}
	

	@GetMapping(value="/")
	public String root() {
		return "redirect:/index.do";
	}
	
}
