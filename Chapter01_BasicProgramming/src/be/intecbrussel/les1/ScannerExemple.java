package be.intecbrussel.les1;

import java.util.Scanner;

public class ScannerExemple {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter username");


        String userName = myScanner.nextLine();
        System.out.println("Username is : " + userName);


    }
}
