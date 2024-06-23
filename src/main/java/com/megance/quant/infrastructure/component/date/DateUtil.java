/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.component.date;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: quant
 * @classname: DateUtil
 * @package: com.megance.quant.infrastructure.component.jwt
 * @description: 日期 util
 * @author: linus
 * @create: 2024-06-20 22:33
 **/
@Slf4j
public class DateUtil {
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String FMT_DATE_YYYY = "yyyy";
    public static final String FMT_DATE_YYYYMMDD = "yyyy-MM-dd";
    public static final String FMT_DATE_YYYY_DOT_MM_DOT_DD = "yyyy.MM.dd";
    public static final String FMT_DATE_YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";
    public static final String FMT_DATE_HHMMSS = "HH:mm:ss";
    public static final String FMT_DATE_HHMM = "HH:mm";
    public static final String FMT_DATE_SPECIAL = "yyyyMMdd";
    public static final String FMT_DATE_MMDD = "MM-dd";
    public static final String FMT_DATE_YYYYMMDDHHMM = "yyyy-MM-dd HH:mm";
    public static final String FMT_DATE_MMDD_HHMM = "MM-dd HH:mm";
    public static final String FMT_DATE_MMMDDD = "MM月dd日";
    public static final String FMT_DATE_YYYYMMDDHHMM_NEW = "yyyyMMddHHmm";
    public static final String FMT_DATE_YYYY年MM月DD日 = "yyyy年MM月dd日";
    public static final String FMT_DATE_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String FMT_DATE_YYYYMMDDHH = "yyyyMMddHH";
    public static final String yyyyMMddHHmmssSSS = "yyyyMMddHHmmssSSS";

    public DateUtil() {
    }

    public static String formatDate(Date target, String format) {
        return target == null ? "" : (new SimpleDateFormat(format)).format(target);
    }

    public static String formatDate(Long target, String format) {
        String result = "";
        if (target != null) {
            result = formatDate(new Date(target), format);
        }

        return result;
    }

    public static String formatDate(String src, String srcFormat, String targetFormat) {
        String result = "";
        Date date = formatToDate(src, srcFormat);
        result = formatDate(date, targetFormat);
        return result;
    }

    public static String formatDate(Date target) {
        return formatDate(target, "yyyy-MM-dd");
    }

    public static Date formatToDate(String date, String format) {
        try {
            if (StringUtils.isBlank(date)) {
                return null;
            } else {
                SimpleDateFormat sorceFmt = new SimpleDateFormat(format);
                return new Date(sorceFmt.parse(date).getTime());
            }
        } catch (ParseException var3) {
            log.warn("invalid date :" + date);
            return null;
        }
    }

    public static Timestamp formatToTimestamp(String dateStr, String format) {
        try {
            SimpleDateFormat sorceFmt = new SimpleDateFormat(format);
            return new Timestamp(sorceFmt.parse(dateStr).getTime());
        } catch (ParseException var3) {
            log.warn("invalid date2Get :" + dateStr);
            return null;
        }
    }

    public static String formatTimestamp(Timestamp time, String format) {
        return time == null ? "" : (new SimpleDateFormat(format)).format(time);
    }

    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static Date getIntervalDate(Timestamp date, int days) {
        return new Date(date.getTime() + (long) days * 86400000L);
    }

    public static Timestamp getIntervalTimestamp(Timestamp date, int days) {
        return new Timestamp(getIntervalDate(date, days).getTime());
    }

    public static boolean isToday(Date date) {
        if (date == null) {
            return false;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Calendar calendar = Calendar.getInstance();
                Date today = sdf.parse(sdf.format(calendar.getTime()));
                calendar.setTime(today);
                calendar.add(5, 1);
                return date.getTime() > today.getTime() && date.getTime() < calendar.getTime().getTime();
            } catch (ParseException var4) {
                log.error(var4.getMessage(), var4);
                return false;
            }
        }
    }

    public static boolean isThisMonth(Timestamp date) {
        Calendar source = Calendar.getInstance();
        source.setTimeInMillis(date.getTime());
        Calendar today = Calendar.getInstance();
        today.setTimeInMillis(getCurrentTimestamp().getTime());
        return isSameMonth(source, today);
    }

    public static boolean isSameMonth(Calendar source, Calendar target) {
        if (source != null && target != null) {
            SimpleDateFormat sorceFmt = new SimpleDateFormat("yyyy-MM");
            String sourceDate = sorceFmt.format(source.getTime());
            String targetDate = sorceFmt.format(target.getTime());
            return StringUtils.isNotBlank(sourceDate) && StringUtils.equals(sourceDate, targetDate);
        } else {
            return false;
        }
    }

    public static boolean isNow(Date date) {
        if (date == null) {
            return false;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            try {
                Calendar calendar = Calendar.getInstance();
                Date today = sdf.parse(sdf.format(calendar.getTime()));
                calendar.setTime(today);
                calendar.add(5, 1);
                return date.getTime() >= today.getTime() && date.getTime() < calendar.getTime().getTime();
            } catch (ParseException var4) {
                log.error(var4.getMessage(), var4);
                return false;
            }
        }
    }

    public static Date getDateBeforeMonth(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(new Date());
        calendar.add(2, -month);
        Date dayBeforeHalfYear = new Date(calendar.getTimeInMillis());
        return dayBeforeHalfYear;
    }

    public static Timestamp getBeginOfToday() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = form.format(cal.getTime()) + " 00:00:00";
        Date date = null;

        try {
            date = form.parse(dateStr);
        } catch (ParseException var5) {
            return null;
        }

        return new Timestamp(date.getTime());
    }

    public static Timestamp getEndOfToday() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = form.format(cal.getTime()) + " 23:59:59";
        Date date = null;

        try {
            form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date = form.parse(dateStr);
        } catch (ParseException var5) {
            return null;
        }

        return new Timestamp(date.getTime());
    }

    public static Timestamp getBeginOfThisYear() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        cal.set(2, 0);
        cal.set(5, 1);
        String dateStr = form.format(cal.getTime()) + " 00:00:00";
        Date date = null;

        try {
            date = form.parse(dateStr);
        } catch (ParseException var5) {
            return null;
        }

        return new Timestamp(date.getTime());
    }

    public static Timestamp getBeginOfThisDay(Timestamp time) {
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = form.format(time) + " 00:00:00";
        Date date = null;

        try {
            date = form.parse(dateStr);
        } catch (ParseException var5) {
            return null;
        }

        return new Timestamp(date.getTime());
    }

    public static Timestamp getBeginOfThisMonth() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
        cal.set(5, 1);
        String dateStr = form.format(cal.getTime()) + " 00:00:00";
        Date date = null;

        try {
            date = form.parse(dateStr);
        } catch (ParseException var5) {
            return null;
        }

        return new Timestamp(date.getTime());
    }

    public static Date getTimestampAfter(Timestamp from, int days) {
        Date dayFrom = new Date(from.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayFrom);
        calendar.add(5, days);
        return calendar.getTime();
    }

    public static Date getTimestampAfterHours(Timestamp from, int hours) {
        Date dayFrom = new Date(from.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayFrom);
        calendar.add(10, hours);
        return calendar.getTime();
    }

    /**
     * 返回当前时间 minutes 后的时间
     *
     * @param from    起始时间
     * @param minutes 分钟
     * @return
     */
    public static Date getTimestampAfterMinute(Date from, int minutes) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(from);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }

    public static Timestamp getTimestampAfterMonth(Timestamp from, int months) {
        Date dayFrom = new Date(from.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dayFrom);
        calendar.add(2, months);
        return new Timestamp(calendar.getTime().getTime());
    }

    public static long formatAndGetTimeLongValue(Timestamp time, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date formatTime = new Date();

        try {
            formatTime = sdf.parse(sdf.format(time.getTime()));
        } catch (ParseException var5) {
            log.error(var5.getMessage(), var5);
        }

        return formatTime.getTime() / 1000L;
    }

    public static boolean checkTimeRange(Calendar source, Calendar target, int range, int Unit) {
        if (source != null && target != null && range != 0) {
            if (source.before(target)) {
                source.add(Unit, range);
                return source.compareTo(target) >= 0;
            } else {
                source.add(Unit, range * -1);
                return source.compareTo(target) <= 0;
            }

        } else {
            return false;
        }
    }

    public static boolean isSameDay(Calendar source, Calendar target) {
        if (source != null && target != null) {
            SimpleDateFormat sorceFmt = new SimpleDateFormat("yyyy-MM-dd");
            String sourceDate = sorceFmt.format(source.getTime());
            String targetDate = sorceFmt.format(target.getTime());
            return StringUtils.isNotBlank(sourceDate) && StringUtils.equals(sourceDate, targetDate);
        } else {
            return false;
        }
    }

    public static Date getIntervalDateFormat(String date2Get, String sourceFormat, int days) {
        try {
            SimpleDateFormat sorceFmt = new SimpleDateFormat(sourceFormat);
            new Date();
            Date date = sorceFmt.parse(date2Get);
            date = new Date(date.getTime() + (long) days * 86400000L);
            return date;
        } catch (ParseException var5) {
            return null;
        }
    }

    public static long getDiffDays(Date date1, Date date2) {
        return (date1.getTime() - date2.getTime()) / 3600000L / 24L;
    }

    public static boolean isValidDate(String srcDate, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(srcDate.trim());
            return true;
        } catch (ParseException var4) {
            log.debug("ValidDate Exception", var4);
            return false;
        }
    }
}
