package be.intecbrussel.Opdracht1;

public class ForExample6 {
    public static void main(String[] args) {
        int i = 1, machten = 11;
        int result = 1;
        while (machten != 0) {
            result = result * i;
            // power will get reduced after
            // each multiplication
            machten--;
        }
        System.out.println("Result =  " + result);
    }
}
