package com.company;

public class Square extends Figure implements Drawable{
    @Override
    public double calculatePerimeter() {
        return square = a * 4;
    }
    private int square;
    private int a;

    public Square(int square, int a) {
        this.square = square;
        this.a = a;
    }

    @Override
    public String draw() {
        return "\u2B1B";
    }
}
