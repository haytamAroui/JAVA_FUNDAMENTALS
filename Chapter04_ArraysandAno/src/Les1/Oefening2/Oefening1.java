package Oefening2;
import java.util.Arrays;
public class Oefening1 {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < my_array.length; ++i) {
            sum = sum + my_array[i];
        }
        System.out.println(sum);

//////////////////////////////////////////
        for(int x:my_array){
        sum=sum+x;
            System.out.println(sum);
        }
    }
}

