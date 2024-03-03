package com.mycompany.app;

import com.mycompany.app.Week2.myMethod1;
import com.mycompany.app.Week2.myMethod2;
import com.mycompany.app.Week2.myMethod3;
import com.mycompany.app.Week2.myMethod4;

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
        myMethod3.myMethodThree("Doe");
        System.out.println(myMethod4.myMethodFour(3));
    }
}
