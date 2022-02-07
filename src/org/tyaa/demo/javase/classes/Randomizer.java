package org.tyaa.demo.javase.classes;

import java.util.Random;

public class Randomizer {
    public static int getRandomInt() {
        return 1 + new Random().nextInt(100);
    }
}
