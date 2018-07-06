/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebenezer.ventas.service;

import java.util.List;
import com.ebenezer.ventas.entity.Article;
/**
 *
 * @author Juan Pablo Hernández
 */
public interface IArticleService {
      List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
}
