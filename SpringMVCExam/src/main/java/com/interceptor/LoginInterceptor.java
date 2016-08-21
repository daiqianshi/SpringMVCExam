package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	private static final String[] IGNORE_URI = {"/login.jsp", "/login.do","/assets/"};
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("拦截器开始执行");
		 String url = request.getRequestURL().toString();
		 boolean flag = false;
		 System.out.println(">>>: " + url);
	        for (String s : IGNORE_URI) {
	            if (url.contains(s)) {
	                flag = true;
	                break;
	            }
	        }
	        if (!flag) {
	        	String username =  (String)request.getSession().getAttribute("user"); 
                if(username == null){
                       System.out.println("您还未登录，请登录后再访问");
                        request.getRequestDispatcher("/login.jsp").forward(request, response);
                        return false;
                }
	        }
	        return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
}
