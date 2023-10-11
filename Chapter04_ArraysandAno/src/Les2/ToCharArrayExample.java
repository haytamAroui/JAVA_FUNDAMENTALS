package Les2;

public class ToCharArrayExample {
    public static void main(String[] args) {
        String stringToCHar = "from string to char array";
        char[] charArray = stringToCHar.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch+ "|");
        }
    }
}
