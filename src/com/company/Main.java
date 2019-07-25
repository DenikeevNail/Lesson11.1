package com.company;

public class Main {


    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        figures[0] = new Circle();
        figures[1] = new Triangle(5,6,8);
        figures[2] = new Square(1,3);
        figures[3] = new Rectangle(7,2);
        figures[4] = new Circle();
        figures[5]= new Rectangle(2,4);



        Circle c = new Circle();
        Square s = new Square(12,13);
        Dog d = new Dog("Bobik");
        System.out.println(d.getName()+ d.draw());
        System.out.println(d.callSound());
    }


}
