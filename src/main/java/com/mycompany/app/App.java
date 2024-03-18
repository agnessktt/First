package com.mycompany.app;

import com.mycompany.app.Week2.Code2.AccessControl.Exercise2;
import com.mycompany.app.Week2.Code2.SourceAccessControl.debug;
import com.mycompany.app.Week2.Code3.Methods.myMethod1;
import com.mycompany.app.Week2.Code3.Methods.myMethod2;
import com.mycompany.app.Week2.Code3.Methods.myMethod3;
import com.mycompany.app.Week2.Code3.Methods.myMethod4;
import com.mycompany.app.Week2.Code3.Methods.myMethod5;
import com.mycompany.app.Week3.Code3.Animal;

import java.util.Vector;

public class App {
    static class Book {
        String title;
        String author;
        int numPages;
    
        Book() {
        };
    
        public Book(String t, String a, int p) {
            title = t;
            author = a;
            numPages = p;
        }
    }
    public static void main(String[] args) {
        myMethod1.myMethodOne();
        myMethod2.myMethodTwo();
        myMethod3.myMethodThree("John");
        System.out.println(myMethod4.myMethodFour(3));
        myMethod5.checkAge(20);
        debug.debug1 ("Ukamo");
        Animal myAnimal = new Animal();
      Animal myPig = new Animal();
      Animal myDog = new Animal();
          
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
}
