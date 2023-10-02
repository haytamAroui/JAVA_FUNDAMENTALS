package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class ElektriciteitAPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****** Welcome to Electricity Bill Calculator ******");
        System.out.println("** For more than one house press Yes (y) ");
        System.out.println("** For one house Press No (n)  ");
        char c = input.next().charAt(0);
        input.nextLine();
        String name = "";
        float power = 0.0f;
        float unitprice = 0.0f;
        float hour = 0;
        int days = 0;
        if (c == 'y') {
            System.out.println("**** Enter your information ****");
            for (int i = 0; i < 5; i++) {
                System.out.println("1- Enter your Name:");
                name = input.nextLine();
                System.out.println("2- Enter the Power in watts per hour:");
                power = input.nextFloat();
                System.out.println("3- Enter the Number of hours per day:");
                hour = input.nextInt();
                System.out.println("4- Enter the Number of days per month:");
                days = input.nextInt();
                System.out.println("5- Enter the Unit price for electricity:");
                unitprice = input.nextFloat();
                input.nextLine();
                System.out.println("Enter your information for other home ");
            }
        } else if (c == 'n') {
            System.out.println("Enter your information");
            System.out.println("1- Enter your Name:");
            name = input.nextLine();
            System.out.println("2- Enter the Power in watts per hour:");
            power = input.nextFloat();
            System.out.println("3- Enter the Number of hours per day:");
            hour = input.nextInt();
            System.out.println("4- Enter the Number of days per month:");
            days = input.nextInt();
            System.out.println("5- Enter the Unit price for electricity:");
            unitprice = input.nextFloat();

        } else {
            System.out.println("Invalid choice. Please enter 'y' for Yes or 'n' for No.");
        }
        System.out.println("Name: " + name);
        System.out.println("Power: " + power + " watts");
        System.out.println("Hour per day: " + hour);
        System.out.println("Days per Month: " + days);
        System.out.println("Unit price: " + unitprice);
        //I don't know if the equation is correct
        float  totalkwh =  (power * days * hour / 1000);
        float totalPay = (totalkwh * unitprice);
        System.out.println("Bill pay: " + totalPay + " euro");
        System.out.println("////// Thank you for using this program ////////");
    }
}
