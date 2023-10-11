package Les2.Oefening3;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] array01 = {1, 2, 3, 4};
        int[] array02 = {1, 2, 3, 4};
        int[] array03 = {4, 3, 2, 1};
        int[] array04 = {4, 3, 2, 1};
        long[] array05 = {1, 2, 3, 5};
        System.out.println("Are array01 and array02 equal: " + Arrays.equals(array01, array02));
        System.out.println("Are array01 and array03 equal: " + Arrays.equals(array01, array03));
        System.out.println("Are array01 and array04 equal: " + Arrays.equals(array01, array04));

       // System.out.println("Are array01 and array05 equal: " + Arrays.equals(array01, array05));
        //we can not compare between different datatype in Array



    }
}
