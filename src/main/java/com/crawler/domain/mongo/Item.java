package com.crawler.domain.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

/**
 * 爬虫数据Mongo实体
 * @author yjw
 * @create 2019-01-21 22:13
 */
@Document(collection = "crawler_item")
public class Item {

    /**
     * Mongo主键
     */
    @Id
    private BigInteger id;

    /**
     * 商品来源
     */
    private String source;
    /**
     * 商品品牌
     */
    private String brand;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品价格
     */
    private Float price;
    /**
     * 商品评论数
     */
    private Integer commentCount;
    /**
     * 商品地址
     */
    private String url;
    /**
     * 商品图片地址
     */
    private String imgUrl;
    /**
     * 商品规格参数
     */
    private String params;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", brand='" + brand + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", commentCount=" + commentCount +
                ", url='" + url + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", params='" + params + '\'' +
                '}';
    }
}
