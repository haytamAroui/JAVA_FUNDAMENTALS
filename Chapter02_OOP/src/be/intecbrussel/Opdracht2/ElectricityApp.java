package be.intecbrussel.Opdracht2;

import java.util.Scanner;

public class ElectricityApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****** Welcome to Electricity Bill Calculator ******");
        System.out.println("** For more than one house press Yes (y) ");
        System.out.println("** For one house Press No (n)  ");
        char c = input.next().charAt(0);
        input.nextLine();
        int num_house = 1;
        // Yes or No //////////////////////////////////////
        if (c == 'y' || c=='Y') {
            System.out.println("Enter the number of houses:");
            num_house = input.nextInt();
            input.nextLine();
        } else if (c=='n'|| c=='N') {
            System.out.println("**** you choose 1 house ****");
        }
        else {System.out.println("please entre y of n");
            input.nextLine();
        }
        ///////////////////////////////////////////////////
        for (int i = 1; i <= num_house; i++) {
            System.out.println("**** Enter information for house " + i + " ****");
            System.out.print("Enter consumer name: ");
            String name = input.nextLine();
            System.out.print("Enter wattage per hour: ");
            float power = input.nextFloat();
            System.out.print("Enter number of hours per day electricity is used: ");
            float hour = input.nextFloat();
            System.out.print("Enter number of days per month electricity is used: ");
            int days = input.nextInt();
            System.out.print("Enter unit price of electricity: ");
            float unitprice = input.nextFloat();
            input.nextLine();
            /////////////////////////////////////////////////////////
            float totalkwh = (power * days * hour / 1000);
            float totalPay = (totalkwh * unitprice);
            System.out.println("Name: " + name);
            System.out.println("Total consumed: " + totalkwh);
            System.out.println("Bill pay: " + totalPay + " euro");
        }
        System.out.println("////// Thank you for using this program ////////");
    }
}
