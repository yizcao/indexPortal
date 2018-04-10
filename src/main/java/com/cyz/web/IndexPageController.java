package com.cyz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexPageController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String indexController(){
		return "/WEB-INF/views/index.jsp";
	}
}
