package be.intecbrussel.les2.Oefening;


import java.util.Scanner;

public class oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre: ");
        int number1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int division = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("\nRésultats:");
        System.out.println("Somme: " + sum);
        System.out.println("Multiplication: " + product);
        System.out.println("Soustraction: " + difference);
        System.out.println("Division: " + division);
        System.out.println("Reste: " + remainder);
    }
}


