package uk.ac.cam.mp2226.part1a.oop.supo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OOPLinkedListTest {
    @Test
    void test() {
        OOPLinkedList ll = new OOPLinkedList();
        // []
        assertThrows(IllegalStateException.class, ll::getHd);
        assertThrows(IllegalStateException.class, ll::popHd);
        assertThrows(IndexOutOfBoundsException.class, () -> ll.nth(0));
        assertThrows(IndexOutOfBoundsException.class, () -> ll.nth(9));
        assertEquals(0, ll.length());
        ll.pushHd(7);
        // 7 :: []
        assertEquals(7, ll.getHd());
        assertEquals(1, ll.length());
        ll.pushHd(9);
        ll.pushHd(2);
        // 2 :: 9 :: 7 :: []
        assertEquals(7, ll.nth(2));
        assertEquals(2, ll.nth(0));
        assertEquals(3, ll.length());
        assertEquals(2, ll.popHd());
        // 9 :: 7 :: []
        assertEquals(9, ll.getHd());
        ll.pushHd(3);
        // 3 :: 9 :: 7 :: []
        assertEquals(3, ll.popHd());
        assertEquals(9, ll.popHd());
        // 7 :: []
        assertEquals(7, ll.nth(0));
        assertThrows(IndexOutOfBoundsException.class, () -> ll.nth(1));
        assertEquals(7, ll.popHd());
        // []
        assertEquals(0, ll.length());
        assertThrows(IllegalStateException.class, ll::popHd);
        assertThrows(IllegalStateException.class, ll::getHd);
    }
}
