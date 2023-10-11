package Les2.Oefening3;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int intArr[] = {300, 200, 100, 400, 500};
        System.out.println("Before sorting value at index 0 : " + intArr[0]);
        System.out.println("Before sorting value at index 2  :" + intArr[2]);
        Arrays.sort(intArr);
        System.out.println("After sorting value at index 0 : " + intArr[0]);
        System.out.println("After sorting value at index 2  :" + intArr[2]);
        int keyElement = 300;
        System.out.println((keyElement+ " found at index = " +Arrays.binarySearch(intArr,keyElement)));
    }
}
