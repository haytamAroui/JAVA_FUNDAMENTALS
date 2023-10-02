package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age calculator program\n" +
                "////// Please Enter your age ////////");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("**** You are adult ****");
        } else if (age >= 10) {
            System.out.println("**** You are a teenager ****");
        } else if (age >= 2) {
            System.out.println("**** You are a child ****");
        } else {
            System.out.println("**** You are a baby ****");
        }
        System.out.println("////// Thank you for using this program ////////");
    }
}
