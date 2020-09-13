package org.snowzen.tool.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * 计算两个时间戳之间的时长，最小精确到毫秒
 *
 * @author sobre
 */
public final class TimeCalculator {

    /**
     * 底层通过{@link java.time.Instant#until(Temporal, TemporalUnit)}去进行对比
     * 但该方法只支持到{@link ChronoUnit}中{@code DAYS}级别，更高的基本差值计算需要自行编写
     */
    private static int calculate(Temporal start, Temporal end, TemporalUnit unit) {
        return Math.toIntExact(start.until(end, unit));
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的毫秒差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 毫秒差
     */
    public static long calculateMillis(Date start, Date end) {
        return start.toInstant().until(end.toInstant(), ChronoUnit.MILLIS);
    }

    /**
     * 比较{@link LocalTime start}和{@link LocalTime end}之间的毫秒差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 毫秒差
     */
    public static long calculateMillis(LocalTime start, LocalTime end) {
        return start.until(end, ChronoUnit.MILLIS);
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的毫秒差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 毫秒差
     */
    public static long calculateMillis(LocalDateTime start, LocalDateTime end) {
        return start.until(end, ChronoUnit.MILLIS);
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的秒差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 秒差
     */
    public static int calculateSeconds(Date start, Date end) {
        return calculate(start.toInstant(), end.toInstant(), ChronoUnit.SECONDS);
    }

    /**
     * 比较{@link LocalTime start}和{@link LocalTime end}之间的秒差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 秒差
     */
    public static int calculateSeconds(LocalTime start, LocalTime end) {
        return Math.toIntExact(start.until(end, ChronoUnit.SECONDS));
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的秒差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 秒差
     */
    public static int calculateSeconds(LocalDateTime start, LocalDateTime end) {
        return calculateSeconds(start.toLocalTime(), end.toLocalTime());
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的分钟差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 分钟差
     */
    public static int calculateMinutes(Date start, Date end) {
        return calculate(start.toInstant(), end.toInstant(), ChronoUnit.MINUTES);
    }

    /**
     * 比较{@link LocalTime start}和{@link LocalTime end}之间的分钟差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 分钟差
     */
    public static int calculateMinutes(LocalTime start, LocalTime end) {
        return Math.toIntExact(start.until(end, ChronoUnit.MINUTES));
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的分钟差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 分钟差
     */
    public static int calculateMinutes(LocalDateTime start, LocalDateTime end) {
        return calculateMinutes(start.toLocalTime(), end.toLocalTime());
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的时钟差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 时钟差
     */
    public static int calculateHours(Date start, Date end) {
        return calculate(start.toInstant(), end.toInstant(), ChronoUnit.HOURS);
    }

    /**
     * 比较{@link LocalTime start}和{@link LocalTime end}之间的时钟差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 时钟差
     */
    public static int calculateHours(LocalTime start, LocalTime end) {
        return Math.toIntExact(start.until(end, ChronoUnit.HOURS));
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的时钟差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 时钟差
     */
    public static int calculateHours(LocalDateTime start, LocalDateTime end) {
        return calculateHours(start.toLocalTime(), end.toLocalTime());
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的天数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 天数差
     */
    public static int calculateDays(Date start, Date end) {
        return calculate(start.toInstant(), end.toInstant(), ChronoUnit.DAYS);
    }

    /**
     * 比较{@link LocalDate start}和{@link LocalDate end}之间的天数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 天数差
     */
    public static int calculateDays(LocalDate start, LocalDate end) {
        return Math.toIntExact(start.until(end, ChronoUnit.DAYS));
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的天数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 天数差
     */
    public static int calculateDays(LocalDateTime start, LocalDateTime end) {
        return calculateDays(start.toLocalDate(), end.toLocalDate());
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的月数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 月数差
     */
    public static int calculateMonths(Date start, Date end) {
        LocalDateTime startLocalDateTime = TimeConverter.convertToLocalDateTime(start);
        LocalDateTime endLocalDateTime = TimeConverter.convertToLocalDateTime(end);
        return calculateMonths(startLocalDateTime,endLocalDateTime);
    }

    /**
     * 比较{@link LocalDate start}和{@link LocalDate end}之间的月数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 月数差
     */
    public static int calculateMonths(LocalDate start, LocalDate end) {
        return Math.toIntExact(start.until(end, ChronoUnit.MONTHS));
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的月数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 月数差
     */
    public static int calculateMonths(LocalDateTime start, LocalDateTime end) {
        return calculateMonths(start.toLocalDate(), end.toLocalDate());
    }

    /**
     * 比较{@link Date start}和{@link Date end}之间的年数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 年数差
     */
    public static int calculateYears(Date start, Date end) {
        LocalDateTime startLocalDateTime = TimeConverter.convertToLocalDateTime(start);
        LocalDateTime endLocalDateTime = TimeConverter.convertToLocalDateTime(end);
        return calculateYears(startLocalDateTime,endLocalDateTime);
    }

    /**
     * 比较{@link LocalDate start}和{@link LocalDate end}之间的年数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 年数差
     */
    public static int calculateYears(LocalDate start, LocalDate end) {
        return Math.toIntExact(start.until(end, ChronoUnit.YEARS));
    }

    /**
     * 比较{@link LocalDateTime start}和{@link LocalDateTime end}之间的年数差
     *
     * @param start 开始时间，不能为null
     * @param end   结束时间，不能为null
     * @return 年数差
     */
    public static int calculateYears(LocalDateTime start, LocalDateTime end) {
        return calculateYears(start.toLocalDate(), end.toLocalDate());
    }
}
