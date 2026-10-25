package org.example;

import junit.framework.TestCase;

public class Wyz2Test extends TestCase {

    public void testCheckPassword() {
        assertTrue(Wyz2.checkPassword("Tonietohaslo1"));
        assertTrue(Wyz2.checkPassword("mozeToTo123"));
        assertTrue(Wyz2.checkPassword("ProgramNot1Get"));

        assertFalse(Wyz2.checkPassword("alamakota"));
        assertFalse(Wyz2.checkPassword("123456789"));
        assertFalse(Wyz2.checkPassword("Tak1"));
        assertFalse(Wyz2.checkPassword("a1b2c3d4"));

    }
}