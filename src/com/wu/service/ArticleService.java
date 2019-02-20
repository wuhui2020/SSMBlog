package com.wu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wu.dao.ArticleMapper;
import com.wu.domain.Article;
import com.wu.interfaces.ArticleInterface;

@Service("articleService")
public class ArticleService implements ArticleInterface {
	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public List<Article> searchArticle() {
		return articleMapper.searchArticle();
	}
	
	

}
