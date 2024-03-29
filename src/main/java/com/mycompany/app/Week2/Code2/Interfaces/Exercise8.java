package com.mycompany.app.Week2.Code2.Interfaces;

public class Exercise8 {
    interface FastFood {
        void prepareIngredients();
        void cook();
        void serve();
    }

    public static class Sandwich implements FastFood {
        @Override
        public void prepareIngredients() {
            System.out.println("Getting bread, ham, and cheese");
        }

        @Override
        public void cook() {
            System.out.println("Grilling the sandwich");
        }

        @Override
        public void serve() {
            System.out.println("Serving the sandwich");
        }
    }
}
