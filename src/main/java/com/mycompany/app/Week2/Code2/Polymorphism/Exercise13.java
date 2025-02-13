package com.mycompany.app.Week2.Code2.Polymorphism;

public class Exercise13 {

    public Shared getShared() {
        return new Shared();
    }

    public class Shared{
        private int refcount = 0;
        private long counter = 0;
        private final long id = counter++;
        public Shared() {
            System.out.println("Creating " + this);
        }

        public void addRef() {
            refcount++;
        }
        protected void dispose() {
            if(--refcount == 0) {
                System.out.println("Disposing " + this);
            }
        }

        public String toString() {
            return "Shared " + id;
        }

        public void finalize2() {
            System.out.println("Finalizing " + new String());
        }
    }

    public static class Composing {
        private Shared shared;
        private static long counter = 0;
        private final long id = counter++;

        public Composing(Shared shared) {
            System.out.println("Creating " + this);
            this.shared = shared;
            this.shared.addRef();
        }

        public void dispose() {
            System.out.println("disposing " + this);
            shared.dispose();
        }

        public String toString() {
            return "Composing " + id;
        }
    }
}
