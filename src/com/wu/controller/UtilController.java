package com.wu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wu.domain.User;

@Controller
@RequestMapping("/util")
public class UtilController {
	
	
	
//	@RequestMapping(value="/init",method=RequestMethod.POST)
	@PostMapping("/init")
	@ResponseBody
	public User init(HttpSession session){
//		System.out.println("init");
		return (User)session.getAttribute("use");
		
	}
	
	@RequestMapping(value="/locationredirect",method=RequestMethod.GET)
	public String locationredirect(HttpSession session,String datatype){
//		System.out.println("datatype===="+datatype);
		String src = "";
		if(datatype != "" && datatype.equals("article")){
			src = "../views/blog_article.html";
		}else if(datatype != "" && datatype.equals("categroy")){
			src = "../views/blog_categroy.html";
		}else if(datatype != "" && datatype.equals("user")){
			src = "../views/blog_user.html";
		}
		return "redirect:"+src;
	}
	
}
