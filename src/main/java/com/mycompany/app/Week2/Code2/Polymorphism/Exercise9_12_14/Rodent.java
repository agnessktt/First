package com.mycompany.app.Week2.Code2.Polymorphism.Exercise9_12_14;

public class Rodent {
    private String name;
    private Teeth teeth;

    public Rodent(String name, Teeth sharedTeeth) {
        this.name = name;
        this.teeth = new Teeth();
    }

    public void eat() {}
    public void run() {}
    public void sleep() {}
}
