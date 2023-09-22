package be.intecbrussel.les1;

import java.util.Scanner;

public class ScannerExemple2 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter name");
        String Name = myScanner.nextLine();

        System.out.println("Enter age");
        int age = myScanner.nextInt();

        System.out.println("Enter salary");
        double salary = myScanner.nextDouble();


        System.out.println("your name is : " +Name);
        System.out.println("your age is : " +age);
        System.out.println("your salary is : " +salary);


    }
}