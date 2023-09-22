package be.intecbrussel.les6.oefening5;
import java.util.Scanner;
public class oefening5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" Enter numbers one by one. Enter -1 to stop.");

            int sum = 0;
            int number;

            do {
                number = input.nextInt();
                if (number != -1) {
                    sum += number;
                }
            } while (number != -1);

            System.out.println("the summation is :  " + sum);
        }
}
