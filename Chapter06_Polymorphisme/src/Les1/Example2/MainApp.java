package Les1.Example2;

public class MainApp {
    public static void main(String[] args) {
        Multiplier multiNumbers = new Multiplier();

        int result01 = multiNumbers.multiplyNumbers(2,5);
        int result02 = multiNumbers.multiplyNumbers(2,5,10);

        System.out.println(result01);
        System.out.println(result02);
    }
}
