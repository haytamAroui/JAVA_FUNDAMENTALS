package be.intecbrussel.Opdracht3;
public class ForExample3 {
    public static void main(String[] args) {
        int machten = 0;
        int result = 1;

        while (result < 10000) {
            System.out.println("11^" + machten + " = " + result);
            machten ++;
            result *= 11;
        }
    }
}

       /* int result = 1;
        for (int machten = 0; result < 10000; machten++) {
        System.out.println("11^" + machten + " = " + result);
        result *= 11;
        }*/
