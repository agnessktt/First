package com.mycompany.app.Week2.Code2.Polymorphism.Test;

public class Detergent {
    private String name;

    private Cleanser cleanser = new Cleanser();

    public Detergent(){}
    public Detergent(String name) {
        this.name = name;
    }

    public void append(String a) {
        cleanser.append(a);
    }
    public void dilute() {
        cleanser.dilute();
    }
    public void apply() {
        cleanser.apply();
    }
    public void scrub() {
        cleanser.scrub();
    }
    // new method to Detergent
    public void foam() {
        cleanser.append(" foam");
    }
    public String toString() {
        return cleanser.toString();
    }
}