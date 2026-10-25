package org.example;

import junit.framework.TestCase;

import java.time.LocalDate;

public class Wyz5Test extends TestCase {

    public void testFor100Days() {
        assertEquals(LocalDate.of(2026,04,11),Wyz5.for100Days(LocalDate.of(2026,01,01)));
        assertEquals(LocalDate.of(2021,2,14),Wyz5.for100Days(LocalDate.of(2020,11,6)));
        assertEquals(LocalDate.of(2023,2,16),Wyz5.for100Days(LocalDate.of(2022,11,8)));
    }
}