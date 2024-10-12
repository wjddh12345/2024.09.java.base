package com.pjo.java.ssg.service;

import java.util.List;

import com.pjo.java.ssg.dao.ArticleDao;
import com.pjo.java.ssg.dto.Article;

public class ArticleService {
	private ArticleDao articleDao;
	
	public ArticleService() {
		articleDao = new ArticleDao();
	}
	
	public int getLastId() {
		return articleDao.getLastId();
	}
	
	public int getNewId() {
		return articleDao.getNewId();
	}
	
	public Article getArticleById(int id) {
		return articleDao.getArticleById(id);
	}

	public int getArticleIndexById(int id) {
		return articleDao.getArticleIndexById(id);
	}

	public void add(Article article) {
		articleDao.add(article);
	}

	public void remove(int foundIndex) {
		articleDao.remove(foundIndex);
	}

	public List<Article> getArticles() {
		return articleDao.getArticles();
	}

}
