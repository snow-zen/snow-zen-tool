package org.snowzen.tool.lang;

/**
 * {@link String}的操作工具类
 *
 * @author sobre
 * @date 2020/3/5
 */
public final class StringUtil {

    // Suppresses default constructor, ensuring non-instantiability.
    private StringUtil() {
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
     * @param str 判断字符串，可以为null
     * @return 字符串为 {@code null} 或 {@link String#length()} 返回 {@code 0} 时，返回 {@code true}；
     * 否则返回 {@code false}
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
