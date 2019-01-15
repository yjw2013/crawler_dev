package com.crawler.dao.converter;

import org.springframework.core.convert.converter.Converter;

import java.sql.Timestamp;
import java.util.Date;

/**
 * MongoDB时间类型转换器
 */
public class TimeTypeConverter implements Converter<Date, Timestamp>{

    public Timestamp convert(Date date) {
        return new Timestamp(date.getTime());
    }
}
