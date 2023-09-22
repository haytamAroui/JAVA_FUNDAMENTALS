/*package be.intecbrussel.les4;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("| .. Welcome to EvenOdda .. |" +
                " Please enter a number: ");
        int number1 = myScanner.nextInt();
        int number2=2;
        int result=number1 % number2;

        if (result == 0) {
            System.out.println( +number1 +" | Even .. Thank you for using our application ..");
        } else if (result != 0){
        System.out.println( +number1 +" | Oneven .. Thank you for using our application ..");
        }
        else ()
        {
            System.out.println( "| Error!! You have NOT entered any number.. | Thank you for using our application ..);
        }
        }

    }
}

 */
package be.intecbrussel.les4;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("| .. Welcome to EvenOdda .. |");
        System.out.println(" Please enter a number: ");

        while (myScanner.hasNextInt()) {
            int number1 = myScanner.nextInt();
            int number2 = 2;
            int result = number1 % number2;
            if (result == 0) {
                System.out.println(number1 + " | Even .. Thank you for using our application ..");
            } else {
                System.out.println(number1 + " | Oneven .. Thank you for using our application ..");
            }
            System.out.println(" Please enter another number: ");
        }
        System.out.println("| Error!! You have NOT entered any number.. | Thank you for using our application ..");


    }
}
