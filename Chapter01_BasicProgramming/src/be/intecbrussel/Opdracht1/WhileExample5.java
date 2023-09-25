package be.intecbrussel.Opdracht1;

import java.util.Scanner;
public class WhileExample5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre an number between 0 and 10");
        int number = 0;
        while (number <= 10) {
            number = input.nextInt();
            System.out.println("the number is  " + number);
            if (number > 10) {
                break;}
        }
        System.out.println("Wrong number please entre an number between 0 and 10");
    }
}
