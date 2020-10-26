package com.vueblog.demo.common.processor;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author liumeng
 */
public class JsonDateValueProcessor implements JsonValueProcessor {

    private static String format = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    @Override
    public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
        return process(o);
    }

    /**
     * Bean中数据类型转换为实体类的方法
     *
     * @param value
     * @return
     */
    private Object process(Object value) {
        if (value instanceof Date) {
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.UK);
            return sdf.format(value);
        }
        return value == null ? "" : value.toString();
    }
}
