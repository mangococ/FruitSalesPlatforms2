package com.fruitsalesplatform.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fruitsalesplatform.entity.User;

@Controller
public class UserController { 

	
	
	//跳转至登录页面
	@RequestMapping("/user/toLogin.action")  
    public String toLogin(){ 
		return "/register.jsp";//转向登录页面
	}
	
	//跳转至注册页面
	@RequestMapping("/user/registerPage.action")  
    public String toRegister(){ 
		return "/register.jsp";//转向登录页面
	}
      
  
}
