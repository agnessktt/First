package com.mycompany.app.Week2.Code2.CleanUp;

public class Exercise11 {

    public boolean finalized = false;

    public class InnerExercise11 {

        public InnerExercise11() {
            System.out.println("Creating an object");
        }

        // Finalize method
        protected void finalize() {
            System.out.println("Finalizing an object");
            finalized = true;
        }

    }

    public void run() {
        InnerExercise11 innerEx11 = new InnerExercise11();
        innerEx11 = null;
        while (!finalized) {
            System.gc(); // Requesting garbage collection
        }
    }
}
