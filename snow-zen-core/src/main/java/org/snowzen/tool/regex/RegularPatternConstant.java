package org.snowzen.tool.regex;

import java.util.regex.Pattern;

/**
 * 常用的正则匹配规则
 *
 * @author sobre
 */
public final class RegularPatternConstant {

    /**
     * 手机号匹配
     */
    public static final Pattern MOBILE_PHONE_MATCH = Pattern.compile("^(13[0-9]|14[5|7]|15[0|123456789]|18[0|12356789])\\d{8}$");

    /**
     * 电话匹配
     */
    public static final Pattern PHONE_MATCH = Pattern.compile("^([0-9]{3,4}-)?[0-9]{7,8}$");

    /**
     * 邮件匹配
     */
    public static final Pattern EMAIL_MATCH = Pattern.compile("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?");

    /**
     * 身份证匹配
     */
    public static final Pattern ID_CARD_MATCH = Pattern.compile("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)");

    /**
     * 数字匹配
     */
    public static final Pattern NUMBER_MATCH = Pattern.compile("^[0-9]+$");

    /**
     * 汉字匹配
     */
    public static final Pattern CHINESE_MATCH = Pattern.compile("^[\\u4e00-\\u9fa5]+$");

    /**
     * 小写英文匹配
     */
    public static final Pattern LOWER_CASE_ENGLISH_MATCH = Pattern.compile("^[a-z]+$");

    /**
     * 大写英文匹配
     */
    public static final Pattern UPPER_CASE_ENGLISH_MATCH = Pattern.compile("^[A-Z]+$");

    /**
     * 英文匹配
     */
    public static final Pattern ENGLISH_MATCH = Pattern.compile("^[a-zA-z]+$");

    /**
     * DOMAIN域名匹配
     */
    public static final Pattern DOMAIN_MATCH = Pattern.compile("[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+\\.?");

    /**
     * 月份匹配
     */
    public static final Pattern MONTH_MATCH = Pattern.compile("^(0?[1-9]|1[0-2])$");

    /**
     * 日期匹配
     */
    public static final Pattern DAY_OF_MONTH_MATCH = Pattern.compile("^((0?[1-9])|(([12])[0-9])|30|31)$");

    /**
     * HTML标签匹配
     */
    public static final Pattern HTML_MATCH = Pattern.compile("<(.*)(.*)>.*</\\1>|<(.*) />");

    /**
     * 超文本协议匹配
     */
    public static final Pattern HTTP_MATCH = Pattern.compile("^http[s]?://.*");

    /**
     * URL匹配
     */
    public static final Pattern URL_MATCH = Pattern.compile("[a-zA-z]+://[^\\s]*");

    /**
     * IPv4地址匹配
     */
    public static final Pattern IP_V4_MATCH = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

    /**
     * IPv6地址匹配
     */
    public static final Pattern IP_V6_MATCH = Pattern.compile("(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]+|::(ffff(:0{1,4})?:)?((25[0-5]|(2[0-4]|1?[0-9])?[0-9])\\\\.){3}(25[0-5]|(2[0-4]|1?[0-9])?[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1?[0-9])?[0-9])\\.){3}(25[0-5]|(2[0-4]|1?[0-9])?[0-9]))");

    /**
     * 16进制颜色代码匹配
     */
    public static final Pattern HEX_COLOR_MATCH = Pattern.compile("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");

    /**
     * 中国车牌号匹配
     */
    public static final Pattern LICENSE_PLATE_MATCH = Pattern.compile("^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z][A-Z][A-Z0-9]{4}[A-Z0-9挂学警港澳]$");

    /**
     * 匹配数字、26个字母或下划线
     */
    public static final Pattern CHARACTER_MATCH = Pattern.compile("^\\w+$");

    /**
     * 金额匹配，精确到小数后2位
     */
    public static final Pattern MONEY_MATCH = Pattern.compile("^([$￥])?[0-9]+(.[0-9]{2})?$");
}
