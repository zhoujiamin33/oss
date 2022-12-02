package com.example.demo2.util;

import cn.hutool.core.util.StrUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * 时间工具类
 */
public class DateUtils {

    private static final String ISO_EXPANDED_DATE_FORMAT = "yyyy-MM-dd";

    private static final String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static final String DATETIME_PATTERN_HUMAN = "yyyyMMddHHmmss";


    /**
     * 获取某一天的开始时间
     * 即某一天的零时零分零秒
     */
    public static LocalDateTime convert2OneDayStartTime(LocalDateTime localDateTime) {
        if(localDateTime == null) {
            return null;
        }

        String dateStr = localDateTime.format(DateTimeFormatter.ofPattern(ISO_EXPANDED_DATE_FORMAT));

        String curDateStr = getDayStart(dateStr);

        LocalDateTime dateTime = LocalDateTime.parse(curDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return dateTime;
    }

    public static String getDayStart(String curDate) {
        if(StrUtil.isEmpty(curDate)) {
            return null;
        }
        return curDate + " 00:00:00";
    }
}
