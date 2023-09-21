package be.intecbrussel.les5;

public class ContinueWhileExample {
    public static void main(String[] args) {
        int index = 0;
        while (index < 10) {
            if (index == 4) {
                index++; //  incr for if
                continue;}
            System.out.println(index);
            index++; // incr for while

        }
    }
}
