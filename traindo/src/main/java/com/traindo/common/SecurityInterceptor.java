package com.traindo.common;

import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class SecurityInterceptor implements HandlerInterceptor {


	private static final Logger log = LoggerFactory.getLogger(SecurityInterceptor.class);
	@Resource
	private RedisUtil redisUtil;
	/**
	 * 在调用controller具体方法前拦截
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers","Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,token");
		log.info(url);
		if (url.indexOf("/error") > -1) {
			return false;
		}
		if (!(object instanceof HandlerMethod)) {
			return true;
		}
		HandlerMethod handlerMethod = (HandlerMethod) object;
		Method method = handlerMethod.getMethod();
		// 检查是否有passtoken注释，有则跳过认证
		if (method.isAnnotationPresent(PassToken.class)) {
			PassToken passToken = method.getAnnotation(PassToken.class);
			if (passToken.required()) {
				return true;
			}
		}
        Boolean flag = false;
        try{
        	TokenUtil.checkToken(request.getHeader("userToken"));//验证token是否有效
        	flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
		if(!flag) {
			Json json = new Json();
			json.setStatus(499);
			json.setMsg("登录过期，请重新登录");
			json.setSuccess(false);
			response.setCharacterEncoding("utf-8");
			PrintWriter writer = response.getWriter();
			JSONObject obj = JSONObject.parseObject(JSON.toJSONString(json));
			writer.println(obj);
			writer.flush();
			return flag;
		}
		return flag;
	}

	/**
	 * 完成页面的render后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) throws Exception {
	}

	/**
	 * 在调用controller具体方法后拦截
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			ModelAndView modelAndView) throws Exception {
	}

}
