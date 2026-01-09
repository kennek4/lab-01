package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet {
    Scorpion(String name) {
        super(name);
    }

    Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    } 

    @Override
    public String speak() {
        return "bark";
    }
}
