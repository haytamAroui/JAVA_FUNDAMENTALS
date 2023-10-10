package Oefening2;

public class Oefening3 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        double sum = 0.0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println(Math.floor(average));


       /* int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        double sum = 0.0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.format("The average is :" + Math.floor(average));*/
    }

}
