package be.intecbrussel.les4;

public class EqualExample {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        double c=5.5;
        // vergelijken met een vergelijkingsoperator
        boolean equal01=(a==b);
        boolean equal02=(a==c);
        System.out.println(equal01);
        System.out.println(equal02);

        // Hier hebben een voorbeeld gemaakt van 4 string objecten en deze vergelijken we met equals()
        String s1="intec";
        String s2="intec";
        String s3="INTEC";
        String s4="Java";

        boolean equal03 = (s1 == s2);
        boolean equal04 = (s2 == s3);
        boolean equal05 = (s3 == s4);

        //true omdat alles overeenkomt grote van de letters en het woord.
        System.out.println(equal03);

        //false omdat de grootte van de letters niet overeenkomt
        System.out.println(equal04);

        //false omdat de content niet overeenkomt
        System.out.println(equal05);

    }
}
