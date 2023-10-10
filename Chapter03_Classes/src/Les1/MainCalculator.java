package Les1;
import static Les1.Calculator.kleinstenummer;
public class MainCalculator {
    public static void main(String[] args) {
            
//**********   Oefening 1 ***********************************

        kleinstenummer(1.0, 2.0, 3.0);

//**********   Oefening 2 ***********************************
       
        int num1 = 8642;
        int num2 = 123;
        int num3 = 200;
        boolean result1 = Calculator.checkEven(num1);
        boolean result2 = Calculator.checkEven(num2);
        boolean result3 = Calculator.checkEven(num3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

//**********   Oefening 3 ***********************************




      
        int a = 10;
        int b = 5;

        System.out.println("10 + 5 = " + optellen(a, b));
        System.out.println("10 - 5 = " + aftrekken(a, b));
        System.out.println("10 * 5 = " + vermenigvuldigen(a, b));
        System.out.println("10 / 5 = " + delen(a, b));
        System.out.println("10 % 5 = " + modulus(a, b));
    }
}

