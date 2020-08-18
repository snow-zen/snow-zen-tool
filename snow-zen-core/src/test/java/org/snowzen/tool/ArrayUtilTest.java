package org.snowzen.tool;

import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.snowzen.tool.ArrayUtil.removeDuplicates;

/**
 * 测试{@link ArrayUtil}
 *
 * @author sobre
 */
public class ArrayUtilTest {

    @Test
    public void testRemoveDuplicates() {
        // 测试byte[]数组去重
        byte[] bytes = new byte[]{2, 2, 3};
        byte[] emptyBytes = new byte[]{};
        assertArrayEquals(removeDuplicates(bytes), new byte[]{2, 3});
        assertArrayEquals(removeDuplicates(emptyBytes), emptyBytes);

        // 测试char[]数组去重
        char[] chars = new char[]{'a', 'a', 'b'};
        char[] emptyChars = new char[]{};
        assertArrayEquals(removeDuplicates(chars), new char[]{'a', 'b'});
        assertArrayEquals(removeDuplicates(emptyChars), emptyChars);

        // 测试short[]数组去重
        short[] shorts = new short[]{2, 2, 3};
        short[] emptyShorts = new short[]{};
        assertArrayEquals(removeDuplicates(shorts), new short[]{2, 3});
        assertArrayEquals(removeDuplicates(emptyShorts), emptyShorts);

        // 测试int[]数组去重
        int[] ints = new int[]{2, 2, 3};
        int[] emptyInts = new int[]{};
        assertArrayEquals(removeDuplicates(ints), new int[]{2, 3});
        assertArrayEquals(removeDuplicates(emptyInts), emptyInts);

        // 测试long[]数组去重
        long[] longs = new long[]{2L, 2L, 3L};
        long[] emptyLongs = new long[]{};
        assertArrayEquals(removeDuplicates(longs), new long[]{2L, 3L});
        assertArrayEquals(removeDuplicates(emptyLongs), emptyLongs);

        // 测试float[]数组去重
        float[] floats = new float[]{1.25f, 1.25f, 2.25f};
        float[] emptyFloats = new float[]{};
        float floatDelta = 0.01f;
        assertArrayEquals(removeDuplicates(floats), new float[]{1.25f, 2.25f}, floatDelta);
        assertArrayEquals(removeDuplicates(emptyFloats), emptyFloats, floatDelta);

        // 测试double[]数组去重
        double[] doubles = new double[]{1.25, 1.25, 2.25};
        double[] emptyDoubles = new double[]{};
        double doubleDelta = 0.001;
        assertArrayEquals(removeDuplicates(doubles), new double[]{1.25, 2.25}, doubleDelta);
        assertArrayEquals(removeDuplicates(emptyDoubles), emptyDoubles, doubleDelta);

        Temp[] temps = new Temp[]{new Temp(2), new Temp(2), new Temp(3)};
        Temp[] emptyTemps = new Temp[]{};
        assertArrayEquals(removeDuplicates(temps), new Temp[]{new Temp(2), new Temp(3)});
        assertArrayEquals(removeDuplicates(emptyTemps), emptyTemps);
    }

    private static class Temp {
        int value;

        public Temp(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Temp temp = (Temp) o;

            return value == temp.value;
        }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public String toString() {
            return "Temp{" +
                    "value=" + value +
                    '}';
        }
    }
}