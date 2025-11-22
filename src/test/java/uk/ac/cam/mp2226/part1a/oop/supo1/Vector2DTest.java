package uk.ac.cam.mp2226.part1a.oop.supo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {
    @Test
    void add() {
        Vector2D a = new Vector2D(3.2f, -0.5f);
        Vector2D b = new Vector2D(1.1f, 0.2f);
        a.add(b);
        assertEquals(new Vector2D(1.1f, 0.2f), b);  // didn't modify b
        assertEquals(new Vector2D(4.3f, -0.3f), a);
    }

    @Test
    void divide() {
        Vector2D a = new Vector2D(3.2f, -1.6f);
        a.divide(-0.8f);
        assertEquals(new Vector2D(-4.0f, 2.0f), a);
    }

    @Test
    void dot() {
        Vector2D a = new Vector2D(3.25f, -0.5f);
        Vector2D b = new Vector2D(1.125f, 0.25f);
        assertEquals(3.53125f, a.dot(b));
    }

    @Test
    void magnitude() {
        Vector2D a = new Vector2D(4.0f, -3.0f);
        assertEquals(5.0f, a.magnitude());
    }

    @Test
    void normalize() {
        Vector2D a = new Vector2D(4.0f, -3.0f);
        a.normalize();
        assertEquals(new Vector2D(0.8f, -0.6f), a);
        Vector2D b = new Vector2D(0, 0);
        b.normalize();
        assertEquals(new Vector2D(0, 0), b);
    }

    @Test
    void testEquals() {
        assertEquals(
                new Vector2D(1.2f, 0.0f),
                new Vector2D(1.2f, -0.0f));
        assertNotEquals(
                new Vector2D(1.2f, 0.0f),
                new Vector2D(1.2f, -0.5f));
        assertNotEquals(
                new Vector2D(1.1f, -0.5f),
                new Vector2D(1.2f, -0.5f));
        assertNotEquals(new Vector2D(1.2f, 0.1f), new Object());
    }

    @Test
    void testToString() {
        assertEquals("Vector2D{x=1.1, y=-0.3}", new Vector2D(1.1f, -0.3f).toString());
    }

    // I will not be testing trivial getters and setters.
}
