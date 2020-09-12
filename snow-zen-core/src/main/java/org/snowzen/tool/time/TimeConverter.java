package org.snowzen.tool.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

/**
 * 时间转换器
 *
 * @author sobre
 */
public final class TimeConverter {

    /**
     * {@link Date}转换为{@link LocalDateTime}类型时间
     *
     * @param date Date类型时间，不能为null
     * @return LocalDateTime类型时间
     */
    public static LocalDateTime convertToLocalDateTime(Date date) {
        Objects.requireNonNull(date, "date");
        Instant instant = date.toInstant();
        return java.time.LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    /**
     * {@link LocalDateTime}转换为{@link Date}类型时间
     *
     * @param localDateTime LocalDateTime类型时间，不为null
     * @return Date类型时间
     */
    public static Date convertToDate(LocalDateTime localDateTime) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    /**
     * 以传入的{@link Date}作为参考，生成对应时间的{@link Calendar}
     *
     * @param date date类型时间，不能为null
     * @return 生成的calendar日历
     */
    public static Calendar convertToCalendar(Date date) {
        Objects.requireNonNull(date, "date");
        return new Calendar.Builder().setInstant(date).build();
    }

    /**
     * 以传入的{@link LocalDateTime}作为参考，生成对应时间的{@link Calendar}
     *
     * @param localDateTime localDateTime类型时间，不能为null
     * @return 生成的calendar日历
     */
    public static Calendar convertToCalendar(LocalDateTime localDateTime) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        return new Calendar.Builder().setInstant(instant.toEpochMilli())
                .setTimeZone(TimeZone.getDefault()).build();
    }
}
