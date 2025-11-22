package uk.ac.cam.mp2226.part1a.oop.supo1.Q2P7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchSetTest {
    @Test
    void test() {
        SearchSet s = new SearchSet();
        assertFalse(s.contains(10));
        assertEquals(0, s.getNumElements());
        s.insert(10);
        assertTrue(s.contains(10));
        assertEquals(1, s.getNumElements());
        s.insert(6);
        s.insert(3);
        assertTrue(s.contains(6));
        assertFalse(s.contains(15));
        s.insert(15);
        assertTrue(s.contains(15));
        assertEquals(4, s.getNumElements());
        s.insert(18);
        assertTrue(s.contains(18));
        s.insert(11);
        assertTrue(s.contains(11));
        assertFalse(s.contains(21));
        assertFalse(s.contains(1));
        assertEquals(6, s.getNumElements());
        s.insert(11);
        assertEquals(6, s.getNumElements());
        assertTrue(s.contains(11));
    }
}
