package com.mycompany.app.Week2.Code2.Interfaces;

public class Exercise4 {
    public abstract class Base4 {
        public abstract void method();
    }

    public class Derived4 extends Base4 {
        @Override
        public void method() {
            System.out.println("Derived method");
        }
    }
}
