package com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8;

public class Woodwind extends Wind{
    public void play(Note n, int i) {
        System.out.println("Woodwind.play() - " + n.note[i]);
    }

    public String what() {
        return "Woodwind";
    }
}
