package com.company;

public class Rectangle extends Figure implements Drawable {
    @Override
    public double calculatePerimeter() {
        return 2 * a + b;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a;
    private int b;

    @Override
    public String draw() {
        char c = '\u2B1B';
        return c + String.valueOf(c);
    }
}
