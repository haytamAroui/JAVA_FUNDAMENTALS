package Les1.Oefening2;
//Schrijf een programma dat van de volgende array alle elementen optelt.

//int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//De uitkomst moet 55 zijn.

public class Oefening1 {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum=0;
        for(int elements:my_array){
            sum=sum+elements;
            System.out.println(sum);
        }
    }
}
