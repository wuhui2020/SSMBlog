package com.wu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wu.domain.Article;
import com.wu.service.ArticleService;

@Controller
@RequestMapping("article")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@PostMapping("/searchArticle")
	@ResponseBody
	public List<Article> search(){
		List<Article> list = new ArrayList<Article>();
		list = articleService.searchArticle();
		System.out.println(list);
		return list;
	}
	
	
}
