package org.example;

import junit.framework.TestCase;

public class Wyz1Test extends TestCase {


    public void testisEven_true() {
        assertTrue(Wyz1.isEven(10));
        assertTrue(Wyz1.isEven(2));
        assertTrue(Wyz1.isEven(4));
        assertTrue(Wyz1.isEven(6));
        assertTrue(Wyz1.isEven(106));
        assertTrue(Wyz1.isEven(888));
    }

    public void testisEven_false() {
        assertFalse(Wyz1.isEven(1));
        assertFalse(Wyz1.isEven(11));
        assertFalse(Wyz1.isEven(21));
        assertFalse(Wyz1.isEven(67));
        assertFalse(Wyz1.isEven(89));
        assertFalse(Wyz1.isEven(883));


    }
}
