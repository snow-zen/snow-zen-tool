package org.snowzen.tool;

import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

/**
 * 数组相关操作工具
 *
 * @author sobre
 */
public final class ArrayUtil {

    /**
     * 用于去重的BitSet
     */
    private static final ThreadLocal<BitSet> LOCAL_BIT_SET = new ThreadLocal<>();

    /**
     * byte数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static byte[] removeDuplicates(byte[] arr) {
        Set<Byte> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        byte[] newArr = new byte[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * char数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static char[] removeDuplicates(char[] arr) {
        Set<Character> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        char[] newArr = new char[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * short数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static short[] removeDuplicates(short[] arr) {
        Set<Short> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        short[] newArr = new short[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * int数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        int[] newArr = new int[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * long数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static long[] removeDuplicates(long[] arr) {
        Set<Long> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        long[] newArr = new long[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * float数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static float[] removeDuplicates(float[] arr) {
        Set<Float> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        float[] newArr = new float[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * double数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @return 去重后的数组
     */
    public static double[] removeDuplicates(double[] arr) {
        Set<Double> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        double[] newArr = new double[set.size()];

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * 引用类型数组去重，保证去重后数组中元素顺序不变
     *
     * @param arr 数组，不能为 {@code null}
     * @param <T> 数组元素实际类型
     * @return 去重后的数组
     */
    public static <T> T[] removeDuplicates(T[] arr) {
        Set<T> set = new HashSet<>();
        BitSet bitSet = getBitSet();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                bitSet.set(i, false);
            } else {
                bitSet.set(i, true);
                set.add(arr[i]);
            }
        }

        @SuppressWarnings("unchecked")
        T[] newArr = (T[]) Array.newInstance(arr.getClass().getComponentType(), set.size());

        for (int i = 0, j = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    /**
     * 获取当前线程所持有的 {@link BitSet}
     */
    private static BitSet getBitSet() {
        BitSet bitSet = LOCAL_BIT_SET.get();
        if (bitSet == null) {
            synchronized (ArrayUtil.class) {
                bitSet = LOCAL_BIT_SET.get();
                if (bitSet == null) {
                    bitSet = new BitSet();
                    LOCAL_BIT_SET.set(bitSet);
                }
            }
        }
        bitSet.clear();
        return bitSet;
    }


}
