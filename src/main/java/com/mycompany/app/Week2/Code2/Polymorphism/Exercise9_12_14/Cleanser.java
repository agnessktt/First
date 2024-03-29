package com.mycompany.app.Week2.Code2.Polymorphism.Exercise9_12_14;

public class Cleanser {
    private String name = "Cleanser ";
    public void append(String a) {
        name += a;
    }

    public void dilute() {
        append(" dilute");
    }

    public void apply() {
        append(" apply");
    }

    public void scrub() {
        append(" scrub");
    }

    public String toString() {
        return name;
    }
}
