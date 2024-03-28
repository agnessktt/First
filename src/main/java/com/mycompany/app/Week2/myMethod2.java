package com.mycompany.app.Week2;

public class MyMethod2 {
    public static void myMethod2() {
        System.out.println("I just got executed!");
    }

    public static void myMethod2Caller() {
        myMethod2();
        myMethod2();
    }

    public static void nj() {
        myMethod2Caller();
    }
}
