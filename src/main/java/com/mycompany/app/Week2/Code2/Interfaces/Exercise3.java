package com.mycompany.app.Week2.Code2.Interfaces;

public class Exercise3 {
    public abstract class Base {
        Base() {
            print();
        }

        abstract void print();
    }

    public class Derived3 extends Base {
        private int i = 5;

        @Override
        public void print() {
            System.out.println("i = " + i);
        }
}
}