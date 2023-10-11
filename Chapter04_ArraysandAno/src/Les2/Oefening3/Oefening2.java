package Les2.Oefening3;

public class Oefening2 {
    public static void main(String[] args) {

        String[] firstArray = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};

        String[] newArray = firstArray;
        firstArray = secondArray;
        secondArray = newArray;

        System.out.println("Eerste array na wisselen:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();

        System.out.println("Tweede array na wisselen:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }


    }
}
