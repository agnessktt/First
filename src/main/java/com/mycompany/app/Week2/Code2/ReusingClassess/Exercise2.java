package com.mycompany.app.Week2.Code2.ReusingClassess;

public class Exercise2 {
    public class Detergent {
        public void scrub() {
            System.out.println("Detergent.scrub()");
        }

        public void foam() {
            System.out.println("Detergent.foam()");
        }
    }

    public class newDetergent extends Detergent {
        public void scrub() {
            System.out.println("newDetergent.scrub()");
        }

        public void sterilize() {
            System.out.println("newDetergent.sterilize()");
        }
    }
    }
