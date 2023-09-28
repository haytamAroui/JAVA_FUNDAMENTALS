package be.intecbrussel.les4;

public class EqualExample2 {
    public static void main(String[] args) {
        String str01 = "Hello Intec";
        String str02 = new String("Hello Intec");
        String str03 = str02;

// False doordat we 2 objecten vergelijken met andere referentiepunten
        boolean equal01 = (str01 == str02);

// True doordat we hier 2 variabelen vergelijken die naar hetzelfde object wijzen.
        boolean equal02 = (str02 == str03);

        System.out.println(str01.equals(str02));
        System.out.println(str02.equals(str03));
        System.out.println(str03.equals(str01));
    }
}
