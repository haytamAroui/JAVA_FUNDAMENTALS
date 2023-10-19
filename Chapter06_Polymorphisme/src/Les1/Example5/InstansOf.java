package Les1.Example5;

public class InstansOf {
    public static void main(String[] args) {

        String name = "Intec Brussel";

        System.out.println("Is name an instance of String : " + (name instanceof String));

//Belangrijk: Object is de superklas van alle klassen in Java

        System.out.println("Is name an instance of Object class : " + (name instanceof Object));
    }
}

