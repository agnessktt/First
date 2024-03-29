package com.mycompany.app.Week2.Code2.Interfaces;

public class Exercise13 {
    interface Interface1 {
        void method1();
    }

    interface Interface2 extends Interface1 {
        void method2();
    }

    interface Interface3 extends Interface1 {
        void method3();
    }

    interface Interface4 extends Interface2, Interface3 {
        void method4();
    }
}
