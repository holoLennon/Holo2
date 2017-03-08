package com.holo.study;

import org.hibernate.Hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *在 SpringBootApplication 上使用@ServletComponentScan 注解后，Servlet、Filter、Listener 可以直接通过 
 *@WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码。
 */
@SpringBootApplication
@ServletComponentScan
@Controller
public class App {
	/**自定义启动者*/
	public static ApplicationInit applicationInit=null;
		
    public static void main( String[] args ){
    	System.err.println(App.class);
    	SpringApplication springApplication=new SpringApplication(App.class);
    	applicationInit=new ApplicationInit();
    	springApplication.addListeners(applicationInit);
    	springApplication.run(args);
    }
    
    
    //Hibernate 初始化
    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory(){
    	System.out.println();
		return new HibernateJpaSessionFactoryBean();
    	
    }
}
 	