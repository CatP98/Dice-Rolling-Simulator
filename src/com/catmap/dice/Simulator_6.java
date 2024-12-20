package com.catmap.dice;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator_6 {
    public static void main(String[] args) {
        System.out.println("Welcome welcome to the most amazing dice rolling simulator ever!");

        Scanner scanner = new Scanner(System.in); // the arguments tells where we want to get the data from, in this case it's the input from the console

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine(); // nextLine() -> it'll take whatever the user tupes into the console and it'll assgn that value into the variable name,
        System.out.println("Hello, " + name);

        while (true) {
            try {
                System.out.println("How many dice would you like to roll?");
                int nbOfDices = scanner.nextInt();
                System.out.println(" About to roll " + nbOfDices + " dice...");

                Random rand = new Random();

                // Generate Random values representing a real dice
                for (int i = 0; i < nbOfDices; i++) {
                    int rolledNumber = rand.nextInt(6) + 1; // Generates a random integer between 0 and 5 and then sums up 1, to be from 1-6, just like a dice
                    System.out.println(display(rolledNumber));
                }

                System.out.println("Would you like to roll again? Y/N");
                String response = scanner.next().toLowerCase();

                if (!response.equals("y")) {
                    System.out.println("Thanks for playing! Goodbye, " + name + "!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("That is an invalid number. Please try again!");
                scanner.nextLine(); // Clear the invalid input, preventing an infinite loop
            }
        }
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



//        // nextDouble -> decimal numbers between 0 and 1
//        System.out.println(rand.nextDouble());
//        // nextInt() -> nbs intgers, negative and positive
//        System.out.println(rand.nextInt(1,7)); // (origin is inclusive) 1 is included, but 7 is not (bound is exclusive) NOTE: The two-argument version of nextInt(int origin, int bound) is supported and will work as intended.
