package Les1.Oefening;

public class Oefening3 {
    public static void main(String[] args) {
        int[] myArr={21,3,408,50,6988,741};
        for (int i = 0; i < myArr.length; i++) {
            if ((myArr[i] % 2) == 0) {
                System.out.println("the nummer "+myArr[i]+" in the index " +i + " is even");
            } else System.out.println("the nummer " +myArr[i]+ " in the index " +i + " is odd");
        }
    }
}
