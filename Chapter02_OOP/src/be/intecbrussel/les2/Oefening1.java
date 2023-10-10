package be.intecbrussel.les2;
import java.util.Scanner;
public class Oefening1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = input.nextLine();
        StringBuilder revWord = new StringBuilder(word).reverse();
        String txt = revWord.toString();
        if (word.equals(txt)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}