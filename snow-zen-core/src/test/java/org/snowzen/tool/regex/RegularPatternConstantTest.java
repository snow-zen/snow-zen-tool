package org.snowzen.tool.regex;

import org.apache.pdfbox.util.Hex;
import org.junit.Test;

import javax.swing.text.html.HTML;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.snowzen.tool.regex.RegularPatternConstant.*;

/**
 * 测试{@link RegularPatternConstant}
 */
public class RegularPatternConstantTest {

    @Test
    public void testMobilePhone() {
        assertTrue(MOBILE_PHONE_MATCH.matcher("18657924613").matches());

        assertFalse(MOBILE_PHONE_MATCH.matcher("").matches());
        assertFalse(MOBILE_PHONE_MATCH.matcher("00000000000").matches());
        assertFalse(MOBILE_PHONE_MATCH.matcher("99999999999").matches());
        assertFalse(MOBILE_PHONE_MATCH.matcher("12345678901").matches());
        assertFalse(MOBILE_PHONE_MATCH.matcher("186579246133").matches());
        assertFalse(MOBILE_PHONE_MATCH.matcher("1865792461").matches());
        assertFalse(MOBILE_PHONE_MATCH.matcher("186abcde461").matches());
    }

    @Test
    public void testPhone() {
        assertTrue(PHONE_MATCH.matcher("0000-00000001").matches());
        assertTrue(PHONE_MATCH.matcher("00000001").matches());
        assertTrue(PHONE_MATCH.matcher("0000-0000001").matches());
        assertTrue(PHONE_MATCH.matcher("0000001").matches());

        assertFalse(PHONE_MATCH.matcher("").matches());
        assertFalse(PHONE_MATCH.matcher("000001").matches());
        assertFalse(PHONE_MATCH.matcher("0000-000000001").matches());
        assertFalse(PHONE_MATCH.matcher("000000001").matches());
        assertFalse(PHONE_MATCH.matcher("0000-00abc001").matches());
        assertFalse(PHONE_MATCH.matcher("0ab0-00000001").matches());
    }

    @Test
    public void testEmail() {
        assertTrue(EMAIL_MATCH.matcher("1111111111@139.com").matches());
        assertTrue(EMAIL_MATCH.matcher("1111111111@163.com").matches());
        assertTrue(EMAIL_MATCH.matcher("1111111111@qq.com").matches());
        assertTrue(EMAIL_MATCH.matcher("1111111111@gmail.com").matches());

        assertFalse(EMAIL_MATCH.matcher("").matches());
        assertFalse(EMAIL_MATCH.matcher("1111111111gmail.com").matches());
        assertFalse(EMAIL_MATCH.matcher("@gmail.com").matches());
        assertFalse(EMAIL_MATCH.matcher("111111111@.com").matches());
        assertFalse(EMAIL_MATCH.matcher("111111111@gmail").matches());
    }

    @Test
    public void testIdCard() {
        assertTrue(ID_CARD_MATCH.matcher("465164647981615").matches());
        assertTrue(ID_CARD_MATCH.matcher("465164647981615175").matches());
        assertTrue(ID_CARD_MATCH.matcher("46516464798161517X").matches());
        assertTrue(ID_CARD_MATCH.matcher("46516464798161517x").matches());

        assertFalse(ID_CARD_MATCH.matcher("").matches());
        assertFalse(ID_CARD_MATCH.matcher("46516464798161").matches());
        assertFalse(ID_CARD_MATCH.matcher("4651646479816151").matches());
        assertFalse(ID_CARD_MATCH.matcher("4651646479816157").matches());
        assertFalse(ID_CARD_MATCH.matcher("4651646479816151757").matches());
        assertFalse(ID_CARD_MATCH.matcher("abc164647981615175").matches());
        assertFalse(ID_CARD_MATCH.matcher("465164647981615abc").matches());
        assertFalse(ID_CARD_MATCH.matcher("465164647981615175X").matches());
    }

    @Test
    public void testNumber() {
        assertTrue(NUMBER_MATCH.matcher("123").matches());

        assertFalse(NUMBER_MATCH.matcher("").matches());
        assertFalse(NUMBER_MATCH.matcher("abc123").matches());
        assertFalse(NUMBER_MATCH.matcher("123abc").matches());
    }

    @Test
    public void testChinese() {
        assertTrue(CHINESE_MATCH.matcher("中国").matches());
        assertTrue(CHINESE_MATCH.matcher("陶瓷").matches());

        assertFalse(CHINESE_MATCH.matcher("").matches());
        assertFalse(CHINESE_MATCH.matcher("China").matches());
    }

    @Test
    public void testLowercaseEnglish() {
        assertTrue(LOWER_CASE_ENGLISH_MATCH.matcher("english").matches());

        assertFalse(LOWER_CASE_ENGLISH_MATCH.matcher("").matches());
        assertFalse(LOWER_CASE_ENGLISH_MATCH.matcher("English").matches());
        assertFalse(LOWER_CASE_ENGLISH_MATCH.matcher("ENGLISH").matches());
        assertFalse(LOWER_CASE_ENGLISH_MATCH.matcher("english123").matches());
        assertFalse(LOWER_CASE_ENGLISH_MATCH.matcher("English123").matches());
        assertFalse(LOWER_CASE_ENGLISH_MATCH.matcher("ENGLISH123").matches());
    }

    @Test
    public void testUppercaseEnglish() {
        assertTrue(UPPER_CASE_ENGLISH_MATCH.matcher("ENGLISH").matches());

        assertFalse(UPPER_CASE_ENGLISH_MATCH.matcher("").matches());
        assertFalse(UPPER_CASE_ENGLISH_MATCH.matcher("english").matches());
        assertFalse(UPPER_CASE_ENGLISH_MATCH.matcher("English").matches());
        assertFalse(UPPER_CASE_ENGLISH_MATCH.matcher("ENGLISH123").matches());
        assertFalse(UPPER_CASE_ENGLISH_MATCH.matcher("English123").matches());
    }

    @Test
    public void testEnglish() {
        assertTrue(ENGLISH_MATCH.matcher("english").matches());
        assertTrue(ENGLISH_MATCH.matcher("ENGLISH").matches());

        assertFalse(ENGLISH_MATCH.matcher("").matches());
        assertFalse(ENGLISH_MATCH.matcher("123").matches());
        assertFalse(ENGLISH_MATCH.matcher("abc123").matches());
        assertFalse(ENGLISH_MATCH.matcher("123abc").matches());
    }

    @Test
    public void testDomain() {
        assertTrue(DOMAIN_MATCH.matcher("tool.snowzen.org").matches());
        assertTrue(DOMAIN_MATCH.matcher("snowzen.org").matches());

        assertFalse(DOMAIN_MATCH.matcher("").matches());
        assertFalse(DOMAIN_MATCH.matcher("snowzen").matches());
    }

    @Test
    public void testMonth() {
        assertTrue(MONTH_MATCH.matcher("01").matches());
        assertTrue(MONTH_MATCH.matcher("1").matches());
        assertTrue(MONTH_MATCH.matcher("10").matches());
        assertTrue(MONTH_MATCH.matcher("12").matches());

        assertFalse(MONTH_MATCH.matcher("").matches());
        assertFalse(MONTH_MATCH.matcher("00").matches());
        assertFalse(MONTH_MATCH.matcher("13").matches());
    }

    @Test
    public void testDayOfMonth() {
        assertTrue(DAY_OF_MONTH_MATCH.matcher("01").matches());
        assertTrue(DAY_OF_MONTH_MATCH.matcher("1").matches());
        assertTrue(DAY_OF_MONTH_MATCH.matcher("31").matches());

        assertFalse(DAY_OF_MONTH_MATCH.matcher("").matches());
        assertFalse(DAY_OF_MONTH_MATCH.matcher("0").matches());
        assertFalse(DAY_OF_MONTH_MATCH.matcher("32").matches());
    }

    @Test
    public void testHtml() {
        assertTrue(HTML_MATCH.matcher("<p></p>").matches());
        assertTrue(HTML_MATCH.matcher("<br />").matches());

        assertFalse(HTML_MATCH.matcher("").matches());
        assertFalse(HTML_MATCH.matcher("</p>").matches());
        assertFalse(HTML_MATCH.matcher("<p></span>").matches());
    }

    @Test
    public void testHttp() {
        assertTrue(HTTP_MATCH.matcher("https://google.com").matches());
        assertTrue(HTTP_MATCH.matcher("http://google.com").matches());

        assertFalse(HTTP_MATCH.matcher("").matches());
        assertFalse(HTTP_MATCH.matcher("ftp://127.0.0.1").matches());
        assertFalse(HTTP_MATCH.matcher("ws://127.0.0.1").matches());
        assertFalse(HTTP_MATCH.matcher("wws://127.0.0.1").matches());
    }

    @Test
    public void testUrl() {
        assertTrue(URL_MATCH.matcher("https://google.com").matches());
        assertTrue(URL_MATCH.matcher("ftp://127.0.0.1").matches());
        assertTrue(URL_MATCH.matcher("ws://127.0.0.1").matches());

        assertFalse(URL_MATCH.matcher("").matches());
        assertFalse(URL_MATCH.matcher("127.0.0.1").matches());
    }

    @Test
    public void testIpv4() {
        assertTrue(IP_V4_MATCH.matcher("192.168.0.1").matches());
        assertTrue(IP_V4_MATCH.matcher("1.1.1.1").matches());
        assertTrue(IP_V4_MATCH.matcher("255.255.255.255").matches());
        assertTrue(IP_V4_MATCH.matcher("0.0.0.0").matches());

        assertFalse(IP_V4_MATCH.matcher("").matches());
        assertFalse(IP_V4_MATCH.matcher("1.1.1").matches());
        assertFalse(IP_V4_MATCH.matcher("1.1.1.1.1").matches());
    }

    @Test
    public void testIpv6() {
        assertTrue(IP_V6_MATCH.matcher("2001:0DB8:0000:0023:0008:0800:200C:417A").matches());

        assertFalse(IP_V6_MATCH.matcher("").matches());
        assertFalse(IP_V6_MATCH.matcher("192.168.0.1").matches());
    }

    @Test
    public void testHexColor() {
        assertTrue(HEX_COLOR_MATCH.matcher("#000000").matches());
        assertTrue(HEX_COLOR_MATCH.matcher("#ffffff").matches());
        assertTrue(HEX_COLOR_MATCH.matcher("#000").matches());
        assertTrue(HEX_COLOR_MATCH.matcher("#fff").matches());

        assertFalse(HEX_COLOR_MATCH.matcher("").matches());
        assertFalse(HEX_COLOR_MATCH.matcher("000000").matches());
        assertFalse(HEX_COLOR_MATCH.matcher("000").matches());
    }

    @Test
    public void testLicensePlate() {
        assertTrue(LICENSE_PLATE_MATCH.matcher("浙B99999").matches());
        assertTrue(LICENSE_PLATE_MATCH.matcher("京A99999").matches());

        assertFalse(LICENSE_PLATE_MATCH.matcher("").matches());
    }

    @Test
    public void testCharacter(){
        assertTrue(CHARACTER_MATCH.matcher("46f5ad4f4a6d").matches());
        assertTrue(CHARACTER_MATCH.matcher("465466416462").matches());
        assertTrue(CHARACTER_MATCH.matcher("dfagweraeaff").matches());
        assertTrue(CHARACTER_MATCH.matcher("dfagw__aeaff").matches());

        assertFalse(CHARACTER_MATCH.matcher("").matches());
        assertFalse(CHARACTER_MATCH.matcher("dfagwer!aeaff").matches());
        assertFalse(CHARACTER_MATCH.matcher("dfagwer<>?aeaff").matches());
    }

    @Test
    public void testMoney(){
        assertTrue(MONEY_MATCH.matcher("100").matches());
        assertTrue(MONEY_MATCH.matcher("100.00").matches());
        assertTrue(MONEY_MATCH.matcher("$100.00").matches());
        assertTrue(MONEY_MATCH.matcher("￥100.00").matches());

        assertFalse(MONEY_MATCH.matcher("").matches());
    }
}
