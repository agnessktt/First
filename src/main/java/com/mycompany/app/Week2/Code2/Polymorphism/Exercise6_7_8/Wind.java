package com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8;

public class Wind extends Instrument{
    public void play(Note n, int i) {
        System.out.println("Wind.play() - " + n.note[i]);
    }

    public String what() {
        return "Wind";
    }

    public void adjust() {
        System.out.println("Adjusting Wind");
    }

}