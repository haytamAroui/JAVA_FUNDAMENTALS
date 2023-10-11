package Les2;

import java.util.Arrays;

public class FillExample {
    public static void main(String[] args) {
        int[] myArray1 = {20, 20, 10, 30, 20, 20, 20, 20, 40, 20};
        Arrays.fill(myArray1, 10);
        System.out.println("Array completely filled with 10->" + Arrays.toString(myArray1));

        int[] myArray2 = {20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
        Arrays.fill(myArray2, 2, 6, 1000);
        System.out.println(Arrays.toString(myArray2));
    }
}
