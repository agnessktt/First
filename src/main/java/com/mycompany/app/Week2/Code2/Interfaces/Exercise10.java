package com.mycompany.app.Week2.Code2.Interfaces;

import com.mycompany.app.Week2.Code2.Polymorphism.Exercise6_7_8.Note;

public class Exercise10 {
    interface Playable {
        void play(Note n);
    }

    abstract class Instrument {
        @Override
        public String toString() {
            return this.getClass().getSimpleName();
        }

        void adjust() {
            System.out.println(this + ".adjust()");
        }
    }

    class Wind extends Instrument implements Playable {
        @Override
        public void play(Note n) {
            System.out.println(this + ".play() " + n);
        }
        // Wind specific methods...
    }

    class Percussion extends Instrument implements Playable {
        @Override
        public void play(Note n) {
            System.out.println(this + ".play() " + n);
        }
        // Percussion specific methods...
    }

    class Stringed extends Instrument implements Playable {
        @Override
        public void play(Note n) {
            System.out.println(this + ".play() " + n);
        }
        // Stringed specific methods...
    }
}
