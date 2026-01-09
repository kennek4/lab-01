package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable {
    Dog(String name) {
        super(name);
    }

    Dog(String name, Date birthDate) {
        super(name, birthDate);
    } 

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public Void pet() {
        return null;
    }
}
