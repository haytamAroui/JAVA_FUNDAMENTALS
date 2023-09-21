package be.intecbrussel.les5.Ofening4;

public class Test {
    public static void main(String[] args) {

        // for loop /////////////////////////////////////////////////////
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop  " + i);}


        // while loop ///////////////////////////////////////////////////
        int x = 1;
        while (x <= 5) {
            x++;
            System.out.println("while loop  " + x);}


        // do while loop ///////////////////////////////////////////////////
        int a = 1;
        do {
            a++;
            System.out.println("do while loop " + a);}
        while (a <= 5);


        //break For loop //////////////////////////////////////////////////////
        for (int z = 1; z <= 5; z++) {
            if (z == 4) {
                break;}
            System.out.println("break For loop  " + z);}


        //break while loop ///////////////////////////////////////////////
        int k = 1;
        while (k <= 5) {
            k++;
            System.out.println("break while loop " + k);
            if (k == 4) {
                break;}}


        //continue for loop /////////////////////////////////////////////////
        for (int s = 1; s <= 5; s++) {
            if (s == 4) {
                continue;}
            System.out.println("continue For loop  " + s);}


        //continue while loop ///////////////////////////////////////////////
        int v=1;
        while(v<=5){
            if(v==4){
                v++;
                continue;}
            System.out.println("continue while loop " +v);
            v++;
        }
    }
}
