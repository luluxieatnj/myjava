package com.xll.juc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *  实用jdk8时间函数处理工具
 */
public class DateUtil {

    private static final DateTimeFormatter fomat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String formatDate() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(fomat);
    }

    public static String getToday() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    public static String format(Date date, String pattern) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatNow(String pattern) {
        return new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern(pattern));
    }

}
