package org.snowzen.tool.lang;

/**
 * byte或{@link Byte}相关操作工具
 *
 * @author sobre
 */
public final class ByteUtil {

    /**
     * 字节数组转字符串
     *
     * @param bytes 需要转换的byte数组，数组不能为null
     * @return 转换后的字符串
     */
    public static String toHexString(byte[] bytes) {
        StringBuilder builder = new StringBuilder(bytes.length);
        for (byte b : bytes) {
            String tmp = Integer.toHexString(b & 0xff);
            if (tmp.length() < 2) {
                builder.append(0);
            }
            builder.append(tmp);
        }
        return builder.toString();
    }
}
