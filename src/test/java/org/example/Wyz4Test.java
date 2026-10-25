package org.example;

import junit.framework.TestCase;

public class Wyz4Test extends TestCase {

    public void testCalculateBill() {
        assertEquals(22.74, Wyz4.calculateBill(1800));
        assertEquals(22.74, Wyz4.calculateBill(2244));
        assertEquals(26.64, Wyz4.calculateBill(2245));
        assertEquals(26.64, Wyz4.calculateBill(2992));
        assertEquals(46.14, Wyz4.calculateBill(6000));

    }
}