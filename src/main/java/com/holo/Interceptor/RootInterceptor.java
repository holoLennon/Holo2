package com.holo.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.holo.common.bean.User;
/**
 * 拦截器
 * @author Holo
 *
 */
public class RootInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.err.println("xxxx");
		HttpSession session=request.getSession();
		User user=(User)session.getAttribute("user");
		if(user==null){
			System.err.println("wa");
		}else {
			System.err.println(user.getId());
		}
		//true 表示继续执行
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.err.println("请求之前");
		// if (logger.isDebugEnabled())logger.debug("请求之前");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.err.println("请求之后");
		//if (logger.isDebugEnabled())logger.debug("请求之后");
		
	}

}
