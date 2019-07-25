package com.company;

public class Circle extends Figure implements Drawable{
    @Override
    public double calculatePerimeter() {
        return  2 * PI * radius;
    }
    private double radius;
    private final double PI = 3.14;


    @Override
    public String draw() {
        return "\u26AB";
    }
}


