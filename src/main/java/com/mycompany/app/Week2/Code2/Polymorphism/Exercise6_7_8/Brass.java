package com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8;

public class Brass extends Instrument{
    public void play(Note n, int i) {
        System.out.println("Brass.play() - " + n.note[i]);
    }

    public String what() {
        return "Brass";
    }
}
