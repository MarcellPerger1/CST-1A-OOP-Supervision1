package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalArrayTest {
    @Test
    void test() {
        FunctionalArray a = new FunctionalArray(7);
        assertThrows(IndexOutOfBoundsException.class, () -> a.set(-1, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> a.set(7, 5));
        a.set(0, 4);
        a.set(5, 7);
        a.set(6, 9);
        assertEquals(4, a.get(0));
        assertEquals(7, a.get(5));
        assertEquals(9, a.get(6));
        // This is surprisingly enough for 100% coverage.
        // However, I don't trust myself with non-(POT - 1) trees.
        FunctionalArray b = new FunctionalArray(12);
        assertThrows(IndexOutOfBoundsException.class, () -> a.set(-1, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> a.set(12, 5));
        b.set(0, 123);
        b.set(7, 456);
        b.set(4, 789);
        b.set(11, 314);
        b.set(5, 271);
        assertEquals(123, b.get(0));
        assertEquals(456, b.get(7));
        assertEquals(789, b.get(4));
        assertEquals(314, b.get(11));
        assertEquals(271, b.get(5));
    }
}
