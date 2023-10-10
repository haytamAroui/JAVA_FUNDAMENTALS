package be.intecbrussel.Opdracht3;
import java.util.Scanner;
public class Oefening1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Entre your username");
        String username=input.nextLine();
        String gorilla="gorilla";
        String gori="gori";
        String harambe="harambe";
        String username_lower=username.toLowerCase();
        if(username_lower.contains(gorilla) || username_lower.contains(gori) || username_lower.contains(harambe)){
            System.out.println("this username is forbidden");
            input.nextLine();
            for(int i=0;i<1;i++){
                System.out.println("Entre another username " +(1-i)+ " more times left");
                input.nextLine();
                System.out.println("Your account is blocked");
            }
        } else System.out.println("your username is accepted");
    }
}
