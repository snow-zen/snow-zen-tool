package org.snowzen.tool;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.snowzen.tool.lang.StringUtil.ensureStringBegin;
import static org.snowzen.tool.lang.StringUtil.ensureStringEnd;
import static org.snowzen.tool.lang.StringUtil.flipWord;
import static org.snowzen.tool.lang.StringUtil.initialsToUpperCase;
import static org.snowzen.tool.lang.StringUtil.isEmpty;
import static org.snowzen.tool.lang.StringUtil.mustNotEmpty;

/**
 * 测试{@link org.snowzen.tool.lang.StringUtil}
 *
 * @author sobre
 */
public class StringUtilTest {

    private static final String ACTUAL_STR = "TestSobre";

    @Test(expected = IllegalArgumentException.class)
    public void testEmpty() {
        assertFalse(isEmpty(ACTUAL_STR));
        mustNotEmpty("");
    }

    @Test
    public void testEnsureStringBegin() {
        String str = "xxxxSobre";
        assertEquals(ensureStringBegin(str, "Test"), ACTUAL_STR);
    }

    @Test
    public void testEnsureStringEnd() {
        String str = "Testxxxxx";
        assertEquals(ensureStringEnd(str, "Sobre"), ACTUAL_STR);
    }

    @Test
    public void testFlipWord() {
        final String expect = "Sobre love I";
        assertEquals(flipWord("I love Sobre"), expect);
        assertEquals(flipWord("  I love Sobre  "), expect);
        assertEquals(flipWord("  I love Sobre"), expect);
        assertEquals(flipWord("I love Sobre  "), expect);
        assertEquals(flipWord("I love    Sobre  "), expect);
    }

    @Test
    public void testInitialsToUpperCase() {
        String str = "testSobre";
        assertEquals(initialsToUpperCase(str), ACTUAL_STR);
    }
}
