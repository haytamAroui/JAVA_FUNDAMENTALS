package be.intecbrussel.Opdracht1;

import java.util.Scanner;

public class ForExample5 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Entre an number between -10 and 10");
            for (int number =1;10>=number;number++) {
                number = input.nextInt();
                if(number<=10) {
                    System.out.println("+ " + number);
                }
                else if (number >= -10) {
                    System.out.println("- " + number);
                }
                else
                    break;
            }
            }
    }

