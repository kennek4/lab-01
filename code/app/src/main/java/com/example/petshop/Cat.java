package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {
    Cat(String name) {
        super(name);
    }

    Cat(String name, Date birthDate) {
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
