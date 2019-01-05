package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {

	public void createArticle(String title,String content,String writer);
	
	public ArrayList<ArticleBean> articleList();
	public ArrayList<ArticleBean> findBywriter(String writer);
	public ArticleBean findByseq(String seq);
	public String redDate();
	public int countArticle();
	
	
	public void updateContent(String seq,String content);
	
	public void deleteArticle(String seq,String title);
}
