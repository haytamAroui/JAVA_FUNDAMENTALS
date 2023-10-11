package Les2;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] myArr = {10, -20, 33, 9, 97, -65, 365};
        System.out.println("the original my Arr is : ");
        for (int num : myArr) {
            System.out.println(num + " ");
        }
        Arrays.sort(myArr, 0, 4);
        System.out.println("\nthe sorted myArr with a range from 0 to 4:");
        for (int num : myArr) {
            System.out.println(num + " ");
        }
        Arrays.sort(myArr);
        System.out.println("\nThe whole myArr is : ");
        for (int num : myArr) {
            System.out.println(num+" ");
        }
    }
}
