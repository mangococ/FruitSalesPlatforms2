package com.fruitsalesplatform.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fruitsalesplatform.test.entity.User;
import com.fruitsalesplatform.test.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/user/findUser.action")
	private String findUser(User user,Model model){
		System.out.println("控制层");
		List<User> userList=testService.findUserByName(user);
		if (userList.size() > 0) {
			
						User user2 = userList.get(0);
						System.out.println("取出的用户信息1：");
			
						System.out.println("账号：" + user2.getUsername());
						System.out.println("密码：" + user2.getPassword());
						System.out.println("姓名：" + user2.getName());
						System.out.println("电话：" + user2.getTelphone());
						User user3 = userList.get(1);
						System.out.println("取出的用户信息2：");
			
						System.out.println("账号：" + user3.getUsername());
						System.out.println("密码：" + user3.getPassword());
						System.out.println("姓名：" + user3.getName());
						System.out.println("电话：" + user3.getTelphone());
		}
		
		model.addAttribute("userList",userList);
		return "/test/test.jsp";
	}
	
}
