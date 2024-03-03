package com.mycompany.app;

import com.mycompany.app.Week2.myMethod1;
import com.mycompany.app.Week2.myMethod2;

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
    }
}
