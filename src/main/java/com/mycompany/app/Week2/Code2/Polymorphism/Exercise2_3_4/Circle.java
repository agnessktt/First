package com.mycompany.app.Week2.Code2.Polymorphism.Exercise2_3_4;

public class Circle extends Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }

    @Override
    public void message() {
        System.out.println("This is a Circle");
    }
}

