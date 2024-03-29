package com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8;

public class Percussion extends Instrument{
    public void play(Note n, int i) {
        System.out.println("Percussion.play() - " + n.note[i]);
    }

    public String what() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}