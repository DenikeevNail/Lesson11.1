package com.company;

public class Triangle extends Figure implements Drawable{
    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
    private int a;
    private int b;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private int c;

    @Override
    public String draw() {
        return "\ud83d\udd3a";
    }
}
