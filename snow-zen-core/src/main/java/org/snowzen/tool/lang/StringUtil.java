package org.snowzen.tool.lang;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * {@link String}的操作工具类
 *
 * @author sobre
 */
public final class StringUtil {

    public final static String EMPTY_STRING = "";

    /**
     * 确认 {@code src} 是否包含指定前缀 {@code prefix} ，如果不包含则进行替换
     *
     * @param src    解析字符串，不能为 {@code null}
     * @param prefix 指定前缀，不能为 {@code null}
     * @return 确认后字符串
     * @throws IllegalArgumentException  当 {@code src} 或者 {@code prefix} 为 {@code null}
     * @throws IndexOutOfBoundsException 当 {@code prefix} 的长度大于 {@code src} 的长度
     */
    public static String ensureStringBegin(String src, String prefix) {
        mustNotEmpty(src, prefix);
        if (prefix.length() < src.length()) {
            return src.startsWith(prefix) ? src : replace(src, 0, prefix);
        } else {
            throw new IndexOutOfBoundsException("src的长度为" + src.length() + "," + "prefix的长度为" + prefix.length());
        }
    }

    /**
     * 确认 {@code src} 是否包含指定后缀 {@code suffix} ，如果不包含则进行替换
     *
     * @param src    解析字符串，不能为 {@code null}
     * @param suffix 指定后缀，不能为 {@code null}
     * @return 确认后字符串
     * @throws IllegalArgumentException  当 {@code src} 或者 {@code suffix} 为 {@code null}
     * @throws IndexOutOfBoundsException 当 {@code suffix} 的长度大于 {@code src} 的长度
     */
    public static String ensureStringEnd(String src, String suffix) {
        mustNotEmpty(src, suffix);
        if (suffix.length() <= src.length()) {
            return src.endsWith(suffix) ? src : replace(src, src.length() - suffix.length(), suffix);
        } else {
            throw new IndexOutOfBoundsException("src的长度为" + src.length() + "," + "suffix的长度为" + suffix.length());
        }
    }

    /**
     * 翻转字符串中的单词顺序
     *
     * @param src 翻转的原字符，可以为 {@code null}
     * @return 当字符串为 {@code null} 或 {@code length() == 0} 时返回 {@code ""}；否则返回翻转字符串
     */
    public static String flipWord(String src) {
        if (isEmpty(src) || src.trim().length() == 0) {
            return StringUtil.EMPTY_STRING;
        }

        List<String> words = Arrays.asList(src.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    /**
     * 字符串首字母大写
     *
     * @param str 源字符串
     * @return 调整后字符串
     */
    public static String initialsToUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("string is null or empty");
        }
        char[] chars = str.toCharArray();
        char toUpperCase = Character.toUpperCase(chars[0]);
        chars[0] = toUpperCase;
        return String.valueOf(chars);
    }

    /**
     * 字符串是否为空
     *
     * @param str 解析字符串，可以为 {@code null}
     * @return 字符串为 {@code null} 或 {@link String#length()} 返回 {@code 0} 时，返回 {@code true}；
     * 否则返回 {@code false}
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 批量判断字符串是否为空，当有一个为空时抛出 {@link NullPointerException}
     *
     * @param strings 需要判断字符串列表
     * @throws IllegalArgumentException 当至少有一个字符串为 {@code null}
     */
    public static void mustNotEmpty(String... strings) {
        for (String string : strings) {
            if (isEmpty(string)) {
                throw new IllegalArgumentException("string must not null");
            }
        }
    }

    /**
     * 将字符数组指定索引位置之内的添加到{@link StringBuilder}中去，添加范围为[charArr[from], charArr[to])
     */
    private static void appendTo(StringBuilder sb, char[] charArr, int from, int to) {
        for (int i = from; i < to; i++) {
            sb.append(charArr[i]);
        }
    }

    /**
     * 从指定位置替换字符
     */
    private static String replace(String src, int start, String include) {
        char[] chars = src.toCharArray();
        int index = 0;
        for (; start < chars.length && index < include.length(); start++, index++) {
            chars[start] = include.charAt(index);
        }
        return String.valueOf(chars);
    }
}
