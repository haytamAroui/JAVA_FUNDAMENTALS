package be.intecbrussel.les6.oefening5;

import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer een niet-negatief geheel getal in: ");

        int number1 = scanner.nextInt();
        long sum = 1;
        for (int i = 1; i <= number1; i++) {
            sum *= i;
        }

        System.out.println("De faculteit van " + number1 + " is " + sum);
    }
}
