package com.holo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holo.common.util.PermitUtils;
@RestController
@RequestMapping("/rest")
public class InitController {
	@Autowired
	PermitUtils permitUtils;
	/**日志实例*/
	private final Log logger = LogFactory.getLog(getClass());
	public void init(){
		permitUtils.init();
	}
	 @RequestMapping(value="/xxx")
		public String index(HttpServletRequest request,HttpServletResponse response) {
	    	System.err.println("123");
	    	return "Hello World!";
		}
	 @RequestMapping(value="/index")
		public String index2(HttpServletRequest request,HttpServletResponse response) {
		 	System.err.println("xxxxx");
		    return "/web/index";
		}
}
