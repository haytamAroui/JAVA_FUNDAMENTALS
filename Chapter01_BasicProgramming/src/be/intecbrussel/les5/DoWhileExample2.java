package be.intecbrussel.les5;

public class DoWhileExample2 {
    public static void main(String[] args) {
        int i=10;
        // do while loop
        do{
            System.out.println("Hello World");
            i++;
        }
        while(i<13);

        // while do loop wanneer de conditie is false geen result
        while (i<15){
            i++;
            System.out.println("hello ");
        }
    }
}
