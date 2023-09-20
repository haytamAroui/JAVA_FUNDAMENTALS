package be.intecbrussel.les3.oefening2;

public class Ifexample1 {
    public static void main(String[] args) {
        int number = 110;
        int time = 22;
        if (number < 100) {
            System.out.println("the value of number is smaller than 100");
        } else {
            System.out.println("the value of number is NOT than 100");
        }

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

    }
}
