package be.intecbrussel.Opdracht3;
/*ForExample5: Maak een programma dat alle getallen afdrukt tussen –10 en +10.
 Voeg bij de positieve getallen het +teken toe bij het afdrukken van het getal.
 Het getal 0 heeft geen teken */

import java.util.Scanner;
public class ForExample6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between -10 and 10");

        for (int number = 0; number <= 10; number++) {
            number = input.nextInt();
             if (number >= -10 && number <= 10) {
                if (number < 0) {
                    System.out.println(" - " + number);
                } else if (number > 0) {
                    System.out.println(" + " + number);
                } else {
                    System.out.println("The number 0 has no sign");
                }
            } else {
                System.out.println("Invalid input! Please enter a number between -10 and 10.");
            }
        }
    }
}
