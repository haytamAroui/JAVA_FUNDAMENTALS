package be.intecbrussel.les5;

public class DoWhileExample3 {
    public static void main(String[] args) {
        int x = 21, sum = 0;
        do {
            sum += x;
            x--;
        }
        while (x > 10);
        System.out.println("summation :" + sum);
    }
}
