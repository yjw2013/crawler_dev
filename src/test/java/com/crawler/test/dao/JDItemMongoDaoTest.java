package com.crawler.test.dao;

import com.crawler.dao.mongodb.JDItemMongoDAO;
import com.crawler.domain.mongo.Item;
import com.crawler.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yjw
 * @create 2019-01-21 22:10
 */
public class JDItemMongoDaoTest extends BaseTest {

    @Autowired
    private JDItemMongoDAO jdItemMongoDAO;

    @Test
    public void testSave() {
        Item item = new Item();
        item.setUrl("https://www.jd.com");
        jdItemMongoDAO.save(item);
    }

}
