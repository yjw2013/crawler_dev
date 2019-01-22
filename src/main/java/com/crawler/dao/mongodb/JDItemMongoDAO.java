package com.crawler.dao.mongodb;

import com.crawler.domain.mongo.Item;

/**
 * 京东商品Mongo操作DAO接口
 */
public interface JDItemMongoDAO {

    /**
     * 保存商品
     * @param item 商品
     */
    void save(Item item);

}
