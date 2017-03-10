package com.holo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.holo.common.bean.User;
import com.holo.common.exception.HoException;
import com.holo.service.impl.UserServiceImpl;





@RestController
@RequestMapping("/rest/user")
public class UserRestController {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse respons,ModelMap model,User usere,HttpSession session) throws HoException{
		System.err.println(request.getParameter("username"));
		System.err.println(request.getParameter("password"));
		System.err.println(usere);
		User user2session=userServiceImpl.loginCheck(usere);
		request.getSession().setAttribute("user", user2session);
		System.err.println(request.getSession().getAttribute("user").toString());
	}
}
