package com.wu.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wu.domain.User;
import com.wu.service.LoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	@ResponseBody
	public String login(HttpSession session,User user){
		User use = null;
		if(user.getName() != "" && !user.getName().equals("") && user.getPassword() != "" && !user.getPassword().equals("")){
			use  = loginService.login(user);
		}
//		System.out.println(use);
		if(use != null){
			session.setAttribute("use", use);
			return "OK";
		}else{
			return "用户名或密码错误！";
		}
		
	}
	
	
	@RequestMapping(value="/loginout", method=RequestMethod.GET)
	public String loginout(HttpSession session){
		session.removeAttribute("use");
		return "redirect:../login.html";
	}
	
	
	@RequestMapping(value="/searchUser", method=RequestMethod.POST)
	@ResponseBody
	public List<User> searchUser(HttpSession session){
		return loginService.searchUser();
	}
	
	
}
