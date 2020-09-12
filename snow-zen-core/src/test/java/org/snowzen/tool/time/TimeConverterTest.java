package org.snowzen.tool.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.snowzen.tool.time.TimeConverter.*;

/**
 * 测试{@link TimeConverter}
 *
 * @author sobre
 */
public class TimeConverterTest {

    private final Calendar consultCalender = new Calendar.Builder()
            .setDate(2020, 0, 1)
            .setTimeOfDay(0, 0, 0)
            .build();

    private final Date consultDate = consultCalender.getTime();

    private final LocalDateTime consultLocalDateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);


    @Test
    public void testConvertToLocalDateTime() {
        assertEquals(convertToLocalDateTime(consultDate), consultLocalDateTime);
    }

    @Test
    public void testConvertToDate() {
        assertEquals(convertToDate(consultLocalDateTime), consultDate);
    }

    @Test
    public void testConvertToCalendarByDate() {
        assertEquals(convertToCalendar(consultDate), consultCalender);
    }

    @Test
    public void testConvertToCalendarByLocalDateTime() {
        assertEquals(convertToCalendar(consultLocalDateTime), consultCalender);
    }
}