package org.example;

import junit.framework.TestCase;

public class Wyz7Test extends TestCase {

    public void testscrabbleWordCalculator() {
        assertEquals(10, Wyz7.wordScoreCalculator("very"));
        assertEquals(12, Wyz7.wordScoreCalculator("zoo"));
        assertEquals(28, Wyz7.wordScoreCalculator("maximize"));
        assertEquals(17, Wyz7.wordScoreCalculator("exercise"));
        assertEquals(27, Wyz7.wordScoreCalculator("jukebox"));
        assertEquals(26, Wyz7.wordScoreCalculator("flapjack"));
        assertEquals(25, Wyz7.wordScoreCalculator("squeeze"));
        assertEquals(11, Wyz7.wordScoreCalculator("school"));
        assertEquals(9, Wyz7.wordScoreCalculator("ex"));
        assertEquals(12, Wyz7.wordScoreCalculator("common"));
    }


    public void testscrabbleWordCalculator_edgeCases() {
        assertEquals(0, Wyz7.wordScoreCalculator(""));
        assertEquals(0, Wyz7.wordScoreCalculator("          "));
        assertEquals(0, Wyz7.wordScoreCalculator("     12-183     "));

        assertEquals(10, Wyz7.wordScoreCalculator("v2ery"));
        assertEquals(10, Wyz7.wordScoreCalculator("Very"));
        assertEquals(10, Wyz7.wordScoreCalculator("VeRy"));
        assertEquals(10, Wyz7.wordScoreCalculator("VERY"));
        assertEquals(10, Wyz7.wordScoreCalculator("ver!y"));
        assertEquals(10, Wyz7.wordScoreCalculator("ver!y"));
        assertEquals(10, Wyz7.wordScoreCalculator("  ve ry"));
        assertEquals(10, Wyz7.wordScoreCalculator("  ve ry"));
        assertEquals(7, Wyz7.wordScoreCalculator("dadd"));
    }
}