package be.intecbrussel.Opdracht3;

//ForExample6: Maak ForExample5 oefening gebruik van de ? : operator in plaats van het if else statement.

import java.util.Scanner;
public class ForExample5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Voer een getal in tussen -10 en 10");

            for (int number = 0; number <= 10; number++) {
                number = input.nextInt();
                if (number >= -10 && number <= 10) {
                    String sign = (number < 0) ? " - " : ((number > 0) ? " + " : "Het getal 0 heeft geen teken");
                    System.out.println(sign + number);
                } else {
                    System.out.println("Ongeldige invoer! Voer een getal in tussen -10 en 10.");
                }
            }
        }
    }

