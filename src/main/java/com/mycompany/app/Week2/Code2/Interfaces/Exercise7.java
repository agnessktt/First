package com.mycompany.app.Week2.Code2.Interfaces;

import com.mycompany.app.Week2.Code2.SourceInterfaces.Rodent;

public class Exercise7 {
    public class Gerbil implements Rodent {
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

    public class Hamster implements Rodent {

        @Override
        public void eat() {
            System.out.println("Hamster is gobble");
        }

        @Override
        public void run() {
            System.out.println("Hamster run slow");
        }

        @Override
        public void sleep() {
            System.out.println("Hamster is sleeping");
        }

    }

    public class Mouse implements Rodent {

        @Override
        public void eat() {
            System.out.println("Mouse is gobble");
        }

        @Override
        public void run() {
            System.out.println("Mouse run fast");
        }

        @Override
        public void sleep() {
            System.out.println("Mouse is sleeping");
        }
    }
}
