package com.crawler.dao.mongodb.impl;

import com.crawler.dao.mongodb.NetEaseArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

/**
 * 网易新闻实现
 */
@Repository
public class NetEaseArticleDaoImpl implements NetEaseArticleDao {

    private final MongoOperations operations;

    @Autowired
    public NetEaseArticleDaoImpl(MongoOperations operations) {
        this.operations = operations;
    }

}
