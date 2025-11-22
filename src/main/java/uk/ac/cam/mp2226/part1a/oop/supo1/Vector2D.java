package uk.ac.cam.mp2226.part1a.oop.supo1;

public class Vector2D {
    // I really really dislike having to do 'trivial' getters and setters!
    // I understand 'encapsulation and all that' but what it should be is:
    //  Public attributes and when extra non-trivial functionality
    //  is added, it should be converted to a computed property (like
    //  Python's @property decorator) that is a getter and setter function
    //  but with the same syntax as the attribute access.
    // This means that it has all the benefits of encapsulation
    //  (i.e. it can be changed between a computed property and an
    //  attribute without user knowing) but with nicer get/set syntax
    //  and less useless boilerplate code (no trivial setters that
    //  do nothing but a private attribute).
    // However, the problem is that Java doesn't have these
    //  'computed properties' so Java doesn't allow for that clearly
    //  superior way of implementing encapsulation. This is
    //  one of the reasons I dislike Java.
    private float x;
    private float y;

    Vector2D(float x_, float y_) {
        x = x_;
        y = y_;
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void add(Vector2D other) {
        x += other.x;
        y += other.y;
    }
    public void divide(float scalar) {
        x /= scalar;
        y /= scalar;
    }

    public float dot(Vector2D other) {
        return x * other.x + y * other.y;
    }

    // If element type is float, magnitude should be float
    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }
    public void normalize() {
        float m = magnitude();
        if (m > 0) divide(m);
    }

    @Override
    public boolean equals(Object obj) {
        return switch (obj) {
            case Vector2D v -> (x == v.x && y == v.y);
            default -> super.equals(obj);
        };
    }

    @Override
    public String toString() {
        return "Vector2D{x=" + x + ", y=" + y + "}";
    }
}
