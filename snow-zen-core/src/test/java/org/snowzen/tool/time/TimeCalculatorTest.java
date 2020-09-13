package org.snowzen.tool.time;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.snowzen.tool.time.TimeCalculator.*;

public class TimeCalculatorTest {

//    private final Date startDate = new Calendar.Builder()
//            .setDate(2020, 0, 1)
////            .setTimeOfDay(0, 0, 30)
//            .build().getTime();
//
//    private final Date endDate = new Calendar.Builder()
//            .setDate(2020, 11, 31)
////            .setTimeOfDay(0, 0, 0)
//            .build().getTime();
//
//    private final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 12, 30, 30);
//
//    private final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 12, 31, 12, 31, 0);

    @Test
    public void testCalculateMillis() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 0, 1)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 0, 2)
                .build().getTime();
        Assert.assertEquals(calculateMillis(startDate, endDate), 1000L);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 1);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 2);

        Assert.assertEquals(calculateMillis(startLocalDateTime, endLocalDateTime), 1000L);
    }

    @Test
    public void testCalculateSeconds() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 0, 1)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 0, 2)
                .build().getTime();
        Assert.assertEquals(calculateSeconds(startDate, endDate), 1);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 1);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 2);

        Assert.assertEquals(calculateSeconds(startLocalDateTime, endLocalDateTime), 1);
    }

    @Test
    public void testCalculateMinutes() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 0, 0)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 1, 0)
                .build().getTime();
        Assert.assertEquals(calculateMinutes(startDate, endDate), 1);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 1, 0);

        Assert.assertEquals(calculateMinutes(startLocalDateTime, endLocalDateTime), 1);
    }

    @Test
    public void testCalculateHours() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(0, 0, 0)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .setTimeOfDay(1, 0, 0)
                .build().getTime();
        Assert.assertEquals(calculateHours(startDate, endDate), 1);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 1, 1, 1, 0, 0);

        Assert.assertEquals(calculateHours(startLocalDateTime, endLocalDateTime), 1);
    }

    @Test
    public void testCalculateDays() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 0, 2)
                .build().getTime();
        Assert.assertEquals(calculateDays(startDate, endDate), 1);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 1, 2, 0, 0, 0);

        Assert.assertEquals(calculateDays(startLocalDateTime, endLocalDateTime), 1);
    }

    @Test
    public void testCalculateMonths() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 1, 1)
                .build().getTime();
        Assert.assertEquals(calculateMonths(startDate, endDate), 1);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2020, 2, 1, 0, 0, 0);

        Assert.assertEquals(calculateMonths(startLocalDateTime, endLocalDateTime), 1);
    }

    @Test
    public void testCalculateYears() {
        final Date startDate = new Calendar.Builder()
                .setDate(2020, 0, 1)
                .build().getTime();
        final Date endDate = new Calendar.Builder()
                .setDate(2020, 11, 31)
                .build().getTime();
        Assert.assertEquals(calculateYears(startDate, endDate), 0);

        final LocalDateTime startLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
        final LocalDateTime endLocalDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);

        Assert.assertEquals(calculateYears(startLocalDateTime, endLocalDateTime), 1);
    }
}