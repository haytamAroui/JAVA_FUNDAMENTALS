package be.intecbrussel.les6.oefening5;

import java.util.Scanner;

public class oefening4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers one by one. Enter -1 to stop.");
        long sum = 0;
        int i = 0;
       do {
            i = input.nextInt();
            if (i != -1) {
                sum += i;
                System.out.println("enter another number");
            }
        }
        while (i != -1);
        System.out.println("the summation is :" + sum);

        /*while(i != -1) {
            i = input.nextInt();
            sum += i;
        }
        System.out.println("the summation is :" + sum);*/

    }
}