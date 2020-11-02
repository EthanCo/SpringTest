package com.heiko.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String/*转入前*/, Date/*转入后*/> {
    public Date convert(String dataStr) {
        //将日期字符串转换成日期对象，返回
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            return format.parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
