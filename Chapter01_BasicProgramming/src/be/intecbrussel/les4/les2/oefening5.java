package be.intecbrussel.les2;
import java.util.Scanner;
public class oefening5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number" );
        int a = myScanner.nextInt();
        System.out.println("Enter the second number" );
        int b = myScanner.nextInt();
        System.out.println("Enter the third number" );
        int c = myScanner.nextInt();
        System.out.println("Enter the fourth number" );
        int d = myScanner.nextInt();
        System.out.println("Enter the fifth number" );
        int e = myScanner.nextInt();
        int f = (a+b+c+d+e)/5;
        System.out.println("the average of 5 number is  " +f);




    }

}
