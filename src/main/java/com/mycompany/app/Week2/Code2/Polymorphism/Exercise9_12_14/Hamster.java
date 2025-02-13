package com.mycompany.app.Week2.Code2.Polymorphism.Exercise9_12_14;

public class Hamster extends Rodent{
    public Hamster(String name, Teeth sharedTeeth) {
        super(name, sharedTeeth);
    }

    @Override
    public void eat() {
        System.out.println("Hamster is gobble");
    }

    @Override
    public void run() {
        System.out.println("Hamster run slow");
    }

    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping");
    }

}

