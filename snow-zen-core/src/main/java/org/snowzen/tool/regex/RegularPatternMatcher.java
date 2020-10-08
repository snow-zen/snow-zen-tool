package org.snowzen.tool.regex;

import static org.snowzen.tool.regex.RegularPatternConstant.*;

/**
 * 正则匹配器，依赖于{@link RegularPatternConstant}中定义的规则进行匹配
 *
 * @author sobre
 */
public class RegularPatternMatcher {

    public static boolean matchMobilePhone(CharSequence input) {
        return MOBILE_PHONE_MATCH.matcher(input).matches();
    }

    public static boolean matchPhone(CharSequence input) {
        return PHONE_MATCH.matcher(input).matches();
    }

    public static boolean matchEmail(CharSequence input) {
        return EMAIL_MATCH.matcher(input).matches();
    }

    public static boolean matchIdCard(CharSequence input) {
        return ID_CARD_MATCH.matcher(input).matches();
    }

    public static boolean matchNumber(CharSequence input) {
        return NUMBER_MATCH.matcher(input).matches();
    }

    public static boolean matchChinese(CharSequence input) {
        return CHINESE_MATCH.matcher(input).matches();
    }

    public static boolean matchLowercaseEnglish(CharSequence input) {
        return LOWER_CASE_ENGLISH_MATCH.matcher(input).matches();
    }

    public static boolean matchUppercaseEnglish(CharSequence input) {
        return UPPER_CASE_ENGLISH_MATCH.matcher(input).matches();
    }

    public static boolean matchEnglish(CharSequence input) {
        return ENGLISH_MATCH.matcher(input).matches();
    }

    public static boolean matchDomain(CharSequence input) {
        return DOMAIN_MATCH.matcher(input).matches();
    }

    public static boolean matchMonth(CharSequence input) {
        return MONTH_MATCH.matcher(input).matches();
    }

    public static boolean matchDayOfMonth(CharSequence input) {
        return DAY_OF_MONTH_MATCH.matcher(input).matches();
    }

    public static boolean matchHtml(CharSequence input) {
        return HTML_MATCH.matcher(input).matches();
    }

    public static boolean matchHttp(CharSequence input) {
        return HTTP_MATCH.matcher(input).matches();
    }

    public static boolean matchUrl(CharSequence input) {
        return URL_MATCH.matcher(input).matches();
    }

    public static boolean matchIpv4(CharSequence input) {
        return IP_V4_MATCH.matcher(input).matches();
    }

    public static boolean matchIpv6(CharSequence input) {
        return IP_V6_MATCH.matcher(input).matches();
    }

    public static boolean matchHexColor(CharSequence input) {
        return HEX_COLOR_MATCH.matcher(input).matches();
    }

    public static boolean matchLicensePlate(CharSequence input) {
        return LICENSE_PLATE_MATCH.matcher(input).matches();
    }

    public static boolean matchCharacter(CharSequence input) {
        return CHARACTER_MATCH.matcher(input).matches();
    }

    public static boolean matchMoney(CharSequence input) {
        return MONEY_MATCH.matcher(input).matches();
    }
}
