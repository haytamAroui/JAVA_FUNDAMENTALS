package be.intecbrussel.les5;
//Wrapper classes in Java are used to convert primitive data types into objects.
// Deze methode {toString} kunnen we gebruiken om wrapper objecten te converteren naar Strings.
public class WrapperExample {
    public static void main(String[] args) {
        Integer myInt=25000;
        String myString=myInt.toString();
        System.out.println(myString);
        System.out.println("this  is a string with a length of :"+myString.length());
    }
}
