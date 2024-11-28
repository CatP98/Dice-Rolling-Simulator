package com.catmap.dice;

import java.util.Random;

public class Simulator {
    public static void main(String[] args){
        System.out.println("Hello world!");

        // Generate Random values representing a real dice
        Random rand = new Random();
        // nextDouble -> decimal numbers between 0 and 1
        System.out.println(rand.nextDouble());
        // nextInt() -> nbs intgers, negative and positive
        System.out.println(rand.nextInt(1,7)); // (origin is inclusive) 1 is included, but 7 is not (bound is exclusive) NOTE: The two-argument version of nextInt(int origin, int bound) is supported and will work as intended.

        int rolledNumber = rand.nextInt(6) + 1; // Generates a random integer between 0 and 5 and then sums up 1, to be from 1-6, just like a dice

        System.out.println(display(rolledNumber));
    }
    // Demonstrate, visually, a dice on the terminal -> ASCII characters, common when working with terminal apps
    static String display(int value){
        switch (value) {
            case 1: return "_________\n|o      |\n|       |\n|       |\n---------";
            case 2: return "_________\n|o      |\n|       |\n|      o|\n---------";
            case 3: return "_________\n|o      |\n|   o   |\n|      o|\n---------";
            case 4: return "_________\n|o     o|\n|       |\n|o     o|\n---------";
            case 5: return "_________\n|o     o|\n|   o   |\n|o     o|\n---------";
            case 6: return "_________\n|o     o|\n|o     o|\n|o     o|\n---------";
        }
    return "_________\n|       |\n|       |\n|       |\n---------";
    }

}
