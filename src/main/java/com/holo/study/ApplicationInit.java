package com.holo.study;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.holo.controller.InitController;

import freemarker.template.Configuration;
public class ApplicationInit implements ApplicationListener<ContextRefreshedEvent> {
	/**日志实例*/
	private final Log logger = LogFactory.getLog(getClass());
	PropMy propMy;
	PropSys propSys;
	FreeMarkerConfigurer freeMarkerConfigurer=null;
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		try {
			System.err.println("???");
			System.err.println("getResource=" +this.getClass().getResource("/")  );
			propMy=event.getApplicationContext().getBean(PropMy.class);
			propSys=event.getApplicationContext().getBean(PropSys.class);
			System.err.println(("参数：propMy=" + propMy));
			System.err.println(("参数：propSys=" + propSys));
			InitController initController = event.getApplicationContext().getBean(InitController.class);
			System.err.println("xxxx");
			freemarkerInit(event);
			initController.init();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.err.println("fuck");
		}
	}
	private void freemarkerInit(ContextRefreshedEvent event) throws Exception{
		this.freeMarkerConfigurer = event.getApplicationContext().getBean(FreeMarkerConfigurer.class);
		Configuration cfg = this.freeMarkerConfigurer.getConfiguration();
		System.err.println("zzzzzz");
		cfg.setSharedVariable("author", propMy.getName());
		
		String u1=propSys.getBase();
		u1=(StringUtils.isBlank(u1) || "/".equals(u1))?"":u1;
		//相对URL-网站根目录，例："/aaa" 或者 ""
		cfg.setSharedVariable("base",u1);
		//相对URL-网站根目录，例："/aaa" 或者 ""
		cfg.setSharedVariable("baserest",u1+"/restpage");
		//绝对URL-网站根目录，例："http://bbb.com/aaa" 或者 "http://bbb.com"
		cfg.setSharedVariable("wbase",urlAdd(propSys.getWebsite(),u1));
		//服务器根，也就是域名 ex.http://bbb.com
		cfg.setSharedVariable("hbase",urlAdd(propSys.getWebsite(),""));
		cfg.setSharedVariable("res", propMy.getResbase());
		cfg.setSharedVariable("imgbase", propMy.getImgbase());
	}
	/**
	 * 两个相对值的URL相加
	 * ex. /a + /b = /a/b
	 * ex. "" + /b = /b
	 * ex. / + /b = /b
	 * ex. / + / =""
	 * @param u1
	 * @param u2
	 * @return 全部为空，返回 ""
	 */
	public static String urlAdd(String u1,String u2){
		u1=(StringUtils.isBlank(u1) || "/".equals(u1))?"":u1;
		u2=(StringUtils.isBlank(u2) || "/".equals(u2))?"":u2;
		return u1+u2;
	}

}
