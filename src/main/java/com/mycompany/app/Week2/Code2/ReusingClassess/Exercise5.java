package com.mycompany.app.Week2.Code2.ReusingClassess;

public class Exercise5 {
    public class A {
        public A() {
            System.out.println("Call A");
        }
    }

    public class B {
        public B() {
            System.out.println("Call B");
        }
    }

    public class C extends A {
        B bMember = new B();
    }
}
