package com.holo.study;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class InitController {
	@Autowired
	PermitUtils permitUtils;
	/**日志实例*/
	private final Log logger = LogFactory.getLog(getClass());
	public void init(){
		permitUtils.init();
	}
}
