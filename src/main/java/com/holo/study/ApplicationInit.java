package com.holo.study;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
public class ApplicationInit implements ApplicationListener<ContextRefreshedEvent> {
	/**日志实例*/
	private final Log logger = LogFactory.getLog(getClass());
	PropMy propMy;
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		try {
			System.err.println("???");
			System.err.println("getResource=" +this.getClass().getResource("/")  );
			propMy=event.getApplicationContext().getBean(PropMy.class);
			System.err.println(("参数：propMy=" + propMy));
			InitController initController = event.getApplicationContext().getBean(InitController.class);
			System.err.println("xxxx");
			initController.init();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.err.println("fuck");
		}
	}

}
