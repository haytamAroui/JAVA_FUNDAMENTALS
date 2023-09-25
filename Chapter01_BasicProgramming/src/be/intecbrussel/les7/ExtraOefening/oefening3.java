package be.intecbrussel.les7.ExtraOefening;

/*
Schrijf een programma dat de faculteit van een bepaald getal te vinden.
uitleg: De faculteit van een niet-negatief geheel getal n is het product
van alle positieve gehele getallen kleiner dan of gelijk aan n.
 De faculteit van 4 (geschreven als 4!) is bijvoorbeeld 4 x 3 x 2 x 1 = 24.
 */

import java.util.Scanner;
public class oefening3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een niet-negatief geheel getal in: ");
        int number1 = scanner.nextInt();
        long sum = 1;
        for (int i = 1; i <= number1; i++) {
            sum *= i;}
        System.out.println("De faculteit van " + number1 + " is " + sum);
    }
}