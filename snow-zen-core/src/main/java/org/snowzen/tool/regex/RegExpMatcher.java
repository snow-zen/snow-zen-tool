package org.snowzen.tool.regex;

import java.util.regex.Pattern;

import static org.snowzen.tool.regex.RegExpConstant.*;

/**
 * 正则匹配器
 *
 * @author sobre
 * @see RegExpConstant
 */
public class RegExpMatcher {

    private static boolean match(Pattern pattern, CharSequence input) {
        if (input != null && input.length() > 0) {
            return pattern.matcher(input).matches();
        }
        throw new NullPointerException("input");
    }

    public static boolean matchMobilePhone(CharSequence input) {
        return match(MOBILE_PHONE_MATCH, input);
    }

    public static boolean matchPhone(CharSequence input) {
        return match(PHONE_MATCH, input);
    }

    public static boolean matchEmail(CharSequence input) {
        return match(EMAIL_MATCH, input);
    }

    public static boolean matchIdCard(CharSequence input) {
        return match(ID_CARD_MATCH, input);
    }

    public static boolean matchNumber(CharSequence input) {
        return match(NUMBER_MATCH, input);
    }

    public static boolean matchChinese(CharSequence input) {
        return match(CHINESE_MATCH, input);
    }

    public static boolean matchLowercaseEnglish(CharSequence input) {
        return match(LOWER_CASE_ENGLISH_MATCH, input);
    }

    public static boolean matchUppercaseEnglish(CharSequence input) {
        return match(UPPER_CASE_ENGLISH_MATCH, input);
    }

    public static boolean matchEnglish(CharSequence input) {
        return match(ENGLISH_MATCH, input);
    }

    public static boolean matchDomain(CharSequence input) {
        return match(DOMAIN_MATCH, input);
    }

    public static boolean matchMonth(CharSequence input) {
        return match(MONTH_MATCH, input);
    }

    public static boolean matchDayOfMonth(CharSequence input) {
        return match(DAY_OF_MONTH_MATCH, input);
    }

    public static boolean matchHtml(CharSequence input) {
        return match(HTML_MATCH, input);
    }

    public static boolean matchHttp(CharSequence input) {
        return match(HTTP_MATCH, input);
    }

    public static boolean matchUrl(CharSequence input) {
        return match(URL_MATCH, input);
    }

    public static boolean matchIpv4(CharSequence input) {
        return match(IP_V4_MATCH, input);
    }

    public static boolean matchIpv6(CharSequence input) {
        return match(IP_V6_MATCH, input);
    }

    public static boolean matchHexColor(CharSequence input) {
        return match(HEX_COLOR_MATCH, input);
    }

    public static boolean matchLicensePlate(CharSequence input) {
        return match(LICENSE_PLATE_MATCH, input);
    }

    public static boolean matchCharacter(CharSequence input) {
        return match(CHARACTER_MATCH, input);
    }

    public static boolean matchMoney(CharSequence input) {
        return match(MONEY_MATCH, input);
    }
}
