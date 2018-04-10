package com.cyz.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackingPageController {

	@Autowired
	HttpServletResponse response;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value="/usertracking", method=RequestMethod.POST)
	@ResponseBody
	public String userTracking(){
		String email = request.getParameter("email");
		System.out.println(email);
		response.addHeader("Access-Control-Allow-Methods" , "POST,GET,OPTIONS,PUT,DELETE");
		
		response.addHeader("Access-Control-Allow-Origin", "*");
		return email;
	}
}
