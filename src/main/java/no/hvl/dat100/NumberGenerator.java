package no.hvl.dat100;

import java.util.Random;

class NumberGenerator {
    
    Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt();
    }

    private int getSuperRandomNumber() {

    }
}