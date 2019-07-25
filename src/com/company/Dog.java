package com.company;

public class Dog extends Animal implements Drawable,SoundProducable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return "\ud83d\udc29";
    }



    @Override
    public String callSound() {
        return "Gav Gav";
    }



}
