package com.crawler.dao.mongodb.impl;

import com.crawler.dao.mongodb.JDItemMongoDAO;
import com.crawler.domain.mongo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

/**
 * 京东Mongo操作DAO实现
 */
@Repository
public class JDItemMongoDAOImpl implements JDItemMongoDAO {

    private final MongoOperations operations;

    @Autowired
    public JDItemMongoDAOImpl(MongoOperations operations) {
        this.operations = operations;
    }

    @Override
    public void save(Item item) {
        operations.save(item);
    }
}
