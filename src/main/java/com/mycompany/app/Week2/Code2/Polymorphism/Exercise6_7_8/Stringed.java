package com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8;

public class Stringed extends Instrument{
    public void play(Note n, int i) {
        System.out.println("Stringed.play() - " + n.note[i]);
    }

    public String what() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
