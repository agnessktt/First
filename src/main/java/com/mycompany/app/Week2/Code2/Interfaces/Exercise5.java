package com.mycompany.app.Week2.Code2.Interfaces;

import com.mycompany.app.Week2.Code2.SourceInterfaces.Car;

public class Exercise5 implements Car {
    @Override
    public void wheels() {
        System.out.println("wheels: 4");
    }

    @Override
    public void mirror() {
        System.out.println("mirror: Transparent");
    }

    @Override
    public void depot() {
        System.out.println("depot: scream");
    }
}
