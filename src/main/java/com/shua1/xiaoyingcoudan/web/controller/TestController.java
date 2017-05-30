package com.shua1.xiaoyingcoudan.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shua1.common.exception.BusinessException;
import com.shua1.webframework.model.BaseRequest;
import com.shua1.webframework.model.WebUserInfo;
import com.shua1.webframework.templete.CookieHttpTemplete;
import com.shua1.webframework.templete.Templete;

@Controller
public class TestController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	@ResponseBody
	public String test(HttpServletRequest request,HttpServletResponse response,BaseRequest req){
		Templete templete = new CookieHttpTemplete(request, response, req) {
			
			public void doSomething(WebUserInfo webUserInfo) throws BusinessException {
				// TODO Auto-generated method stub
				this.put("hello", "123");
			}
			
			public void before() throws BusinessException {
				// TODO Auto-generated method stub
			}
		};
		return templete.oprate();
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public String test2(HttpServletRequest request,HttpServletResponse response,BaseRequest req,ModelMap modelMap){
		Templete templete = new CookieHttpTemplete(request, response, req,modelMap) {
		
			public void doSomething(WebUserInfo webUserInfo) throws BusinessException {
				this.put("key","123");
				this.setHtmlUrl("test");
			}
		
			public void before() throws BusinessException {
				// TODO Auto-generated method stub
			}
		};
		return templete.oprate();
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String test2(ModelMap modelMap){
		modelMap.put("key", "123");
		return "test";
	}
}
