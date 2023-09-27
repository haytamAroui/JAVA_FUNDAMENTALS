package be.intecbrussel.les1;

public class StringExample {
    public static void main(String[] args) {
        String strupper1 = "haytam";
        System.out.println(strupper1.toUpperCase());

        String strlower1 = "HAYTAM";
        System.out.println(strlower1.toLowerCase());

        String length1 = "hello world";
        System.out.println(length1.length());

        String strblank1 = "A";
        System.out.println(strblank1.isBlank());

        String strreplace1 = "hello world!";
        System.out.println(strreplace1.replace('e', 'a'));

        String strreplace2 = "hello world!";
        System.out.println(strreplace2.replace('l', 'L'));

        String strstrip1 = "   hello world      ";
        System.out.println(strstrip1.strip());

        String strplead1 = "   hello world      ";
        System.out.println(strplead1.stripLeading());

        String strptrail1 = "   hello world      ";
        System.out.println(strptrail1.stripTrailing());

        String strindex1 = "hello world";
        System.out.println(strindex1.indexOf("world"));

        String strcontain1 = "hello world";
        System.out.println(strcontain1.contains("world"));

        String strsubstring1 = "hello world";
        System.out.println(strsubstring1.substring(6, 10));
    }
}
