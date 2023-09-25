/*ForExample5: Create a program that prints all numbers between –10 and +10.
 Add the + sign to positive numbers when printing the number.
 The number 0 has no sign./
we need a loop
we need an index
i= -10
we need to stop looping somewhere
somewhere=10
what do we need the loop for
-print current number
 */

package be.intecbrussel.Opdracht3;

public class for5 {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
           /* if (i > 0) {
                System.out.println("+ " + i);
            } else System.out.println(i);*/
            String message="";
            message=(i>0) ? "+ "+i:String.valueOf(i);
            System.out.println(message);
        }

    }
}



