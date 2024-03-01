package com.mycompany.app;

import com.mycompany.app.Week1.BreakandContinue;

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
      BreakandContinue break1 = new BreakandContinue();
      break1.cc();
    }
}
