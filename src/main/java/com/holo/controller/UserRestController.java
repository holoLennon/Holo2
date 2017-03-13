package com.holo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.holo.common.bean.User;
import com.holo.common.exception.HoException;
import com.holo.common.util.Json;
import com.holo.service.impl.UserServiceImpl;



@RestController
@RequestMapping("/rest/user")
public class UserRestController {
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Json login(HttpServletRequest request,HttpServletResponse respons,ModelMap model,User usere,HttpSession session) throws HoException{
		System.err.println(request.getParameter("username"));
		System.err.println(request.getParameter("password"));
		System.err.println(usere);
		User user2session=userServiceImpl.loginCheck(usere);
		request.getSession().setAttribute("user", user2session);
		System.err.println(request.getSession().getAttribute("user").toString());
		Map<String,Object> ret=new HashMap<String, Object>();
		ret.put("user",user2session);
		return new Json(true,"登录成功！",ret);
	}
	
	/**
	 * 注册提交
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public Json createUser(@Valid User user,BindingResult errors,ModelMap model,HttpServletRequest request,HttpServletResponse response)  {
		if(errors!=null && errors.hasErrors()) {
			return new Json(false,"格式错误！",errors.getFieldErrors());
		}
		Json json=null;
	/*	try {
			//json=specUserService.createReg(user);
		} catch (HoException e) {
			return new Json(false,e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Json(false,"系统正忙，请稍后再试!");
		}*/
		return new Json(false,"系统正忙，请稍后再试!");
	}
}
