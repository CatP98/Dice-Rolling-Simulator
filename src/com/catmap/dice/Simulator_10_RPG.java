package com.catmap.dice;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Simulator_10_RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRolls = 0;

        System.out.println("*************************************************************************");
        System.out.println("**                                                                     **");
        System.out.println("**                  Welcome to the RPG Dice Simulator!                 **");
        System.out.println("** Prepare yourself for an epic adventure as you roll the mighty dice! **");
        System.out.println("**                                                                     **");
        System.out.println("*************************************************************************");
        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println("   Roll the dice and see what fate has in store for you... Good luck!    ");
        System.out.println("*************************************************************************");


        HashMap<Integer,String> diceMeanings = new HashMap<>();
        diceMeanings.put(1, " _________ \n/         \\\n|    1    |\n\\_________/");
        diceMeanings.put(2, " _________ \n/         \\\n|    2    |\n\\_________/");
        diceMeanings.put(3, " _________ \n/         \\\n|    3    |\n\\_________/");
        diceMeanings.put(4, " _________ \n/         \\\n|    4    |\n\\_________/");
        diceMeanings.put(5, " _________ \n/         \\\n|    5    |\n\\_________/");
        diceMeanings.put(6, " _________ \n/         \\\n|    6    |\n\\_________/");
        diceMeanings.put(7, " _________ \n/         \\\n|    7    |\n\\_________/");
        diceMeanings.put(8, " _________ \n/         \\\n|    8    |\n\\_________/");
        diceMeanings.put(9, " _________ \n/         \\\n|    9    |\n\\_________/");
        diceMeanings.put(10, " _________ \n/         \\\n|    10    |\n\\_________/");

        Random rand = new Random();

        while (true) {
            try {
                System.out.println("\nHow many times would you like to roll the dice?");
                int nbOfRolls = scanner.nextInt();

                // Check if the total rolls don't exceed the limit
                if (totalRolls + nbOfRolls <= 10) {
                    System.out.println("About to roll " + nbOfRolls + " dice...");

                    // Declare variables for highest and lowest rolls
                    int highestKey = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
                    int lowestKey = Integer.MAX_VALUE;  // Initialize to the largest possible integer value

                    // Roll the dice and show the results
                    for (int i = 0; i < nbOfRolls; i++) {
                        int rolledNumber = rand.nextInt(10) + 1;

                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("\nRolling dice " + (i + 1) + "...");
                        System.out.println(display(rolledNumber, diceMeanings.get(rolledNumber)));
                        System.out.println("--------------------------------------------------------------------------------------");

                        // Update total rolls count
                        totalRolls++;

                        // Update the highest roll if the current roll is higher
                        if (rolledNumber > highestKey) {
                            highestKey = rolledNumber;
                        }

                        // Update the lowest roll if the current roll is lower
                        if (rolledNumber < lowestKey) {
                            lowestKey = rolledNumber;
                        }
                    }

                    // After all rolls, display the highest and lowest roll results
                    System.out.println("\nHighest roll: " + display(highestKey, diceMeanings.get(highestKey)));
                    System.out.println("Lowest roll: " + display(highestKey, diceMeanings.get(highestKey)));
                    System.out.println("number of rolls " + totalRolls);

                    // Ask if the user wants to roll again
                    System.out.println("\nWould you like to roll again? Y/N");
                    String response = scanner.next().toLowerCase();
                    if (!response.equals("y")) {
                        System.out.println("\nThat's it for now! Good luck on your adventure!");
                        break;
                    }
                }
                else {
                    System.out.println("\nYou have exceeded the maximum number of rolls (10). Please try again.");
                    scanner.nextLine();
                }

            } catch (InputMismatchException e){
                System.out.println("That is an invalid number. Please try again.");
                scanner.nextLine(); // Clear the invalid input, preventing an infinite loop
            }
        }
    }

    public static String display(int key, String value) { //why static?
        switch (key) {
            case 1:
                return "Critical Failure \n" + value + "\nA disastrous outcome, better luck next time!\n";
            case 2:
                return "Critical Failure \n" + value + "\nThis was a terrible roll, something went horribly wrong!\n";
            case 3:
                return "Failure \n" + value + "\nNot quite what you were hoping for. Try again!\n";
            case 4:
                return "Failure \n" + value + "\nNot your best roll, but the adventure continues.\n";
            case 5:
                return "Failure \n" + value + "\nYou failed, but it's not the end of the road.\n";
            case 6:
                return "Partial Success \n" + value + "\nYou've made some progress, but there's more work to do!\n";
            case 7:
                return "Partial Success \n" + value + "\nNot perfect, but you're getting closer!\n";
            case 8:
                return "Partial Success \n" + value + "\nYou're almost there. Success is just around the corner!\n";
            case 9:
                return "Success \n" + value + "\nCongratulations! You've succeeded!\n";
            case 10:
                return "Critical Success \n" + value + "\nA remarkable success, you're a true hero!\n";
            default:
                return "\nInvalid number of sides\n";
        }
    }
}
