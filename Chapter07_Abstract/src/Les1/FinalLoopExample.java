package Les1;

public class FinalLoopExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //final with for each statement
        for (final int number : arr) {
            System.out.println(number);
        }
    }
}
