package Les1;
public class Calculator {
    //**********   Oefening 1 ***********************************

    public static void kleinstenummer(double x, double y, double z) {
        System.out.println(Math.min(Math.min(x, y), z));
    }
    //**********   Oefening 2 ***********************************

    public static boolean checkEven(int number) {
        for (int i = 0; number > 0; i++) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
    //**********   Oefening 3 ***********************************
    
    public static int optellen(int a, int b) {

        return a + b;
    }
    public static int aftrekken(int a, int b) {

        return a - b;
    }
    public static int vermenigvuldigen(int a, int b) {

        return a * b;
    }
    public static int delen(int a, int b) {

        return a / b;
    }
    public static int modulus(int a, int b) {

        return a % b;
    }
}
