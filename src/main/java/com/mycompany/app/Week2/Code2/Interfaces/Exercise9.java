package com.mycompany.app.Week2.Code2.Interfaces;

import com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8.Note;

public class Exercise9 {
    abstract static class Instrument {
        void play(Note n) {
            System.out.println(this + ".play() " + n);
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName();
        }

        void adjust() {
            System.out.println(this + ".adjust()");
        }
    }

    class Wind extends Instrument {
        // Wind specific methods...
    }

    class Percussion extends Instrument {
        // Percussion specific methods...
    }

    class Stringed extends Instrument {
        // Stringed specific methods...
    }
}
