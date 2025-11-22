package uk.ac.cam.mp2226.part1a.oop.supo1;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonBitTest {
    @org.junit.jupiter.api.Test
    void lowestCommon() {
        assertEquals(3, LowestCommonBit.lowestCommon(14L, 25L));
        assertEquals(-1, LowestCommonBit.lowestCommon(
                0xAB12CD67EF3498L, ~0xAB12CD67EF3498L));
    }
}