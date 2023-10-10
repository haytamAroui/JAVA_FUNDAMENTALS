package be.intecbrussel.Opdracht3;
import java.util.Random;
public class Oefening3 {
    public static void main(String[] args) {
        int power_rank=0;
        for (int monster_limit=1;monster_limit<=10;monster_limit++) {
            int monster_point = new Random().nextInt(3)+1;
            // monster point
            switch (monster_point) {
                case 3:
                    System.out.println("Fight monster");
                    System.out.println("You get : " + monster_point + " experience points");
                    break;
                case 2:
                    System.out.println("Fight monster");
                    System.out.println("You get : " + monster_point + " experience points");
                    break;
                default:
                    System.out.println("******* don't fight this monster **********");
            }
            // power rank
               if(power_rank<15 && monster_point != 1){
                power_rank+=monster_point;
                System.out.println("keep fighting");
                System.out.println("your new rank is: " + power_rank);
                }
                else if (power_rank>15){
                System.out.println("you have reached a high level stop fighting "+ power_rank);
                   break;
               }
        }
    }
}

