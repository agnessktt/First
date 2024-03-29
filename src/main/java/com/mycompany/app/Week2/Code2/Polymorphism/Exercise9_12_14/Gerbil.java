package com.mycompany.app.Week2.Code2.Polymorphism.Exercise9_12_14;

public class Gerbil extends Rodent {

    public Gerbil(String name, Teeth sharedTeeth) {
        super(name, sharedTeeth);
    }

        @Override
        public void eat() {
            System.out.println("Gerbil is gobble");
        }

        @Override
        public void run() {
            System.out.println("Gerbil running and jumping");
        }

        @Override
        public void sleep() {
            System.out.println("Gerbil is sleeping");
        }
}
