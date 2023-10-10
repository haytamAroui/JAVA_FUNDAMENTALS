package be.intecbrussel.Opdracht2;

import java.util.Scanner;
import java.util.Random;

public class HigherLowerApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("**** Welcome to Higher Lower App ****");
        int RandomNumbers = random.nextInt(99);
        boolean doesNotMatch = false;
        System.out.println("Guess the number");
        while (!doesNotMatch) {
            int guessedNumber = input.nextInt();
            if (guessedNumber < RandomNumbers) {
                System.out.println("Higher");
                System.out.println(" Please enter another guess: ");
            } else if (guessedNumber > RandomNumbers) {
                System.out.println("Lower");
                System.out.println(" Please enter another guess: ");
            } else {System.out.println("Congrats!");
                doesNotMatch = true;}
        }
        System.out.println("////// Thank you for using this program ////////");
    }
}
