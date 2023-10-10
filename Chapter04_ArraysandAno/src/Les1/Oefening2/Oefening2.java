package Oefening2;

public class Oefening2 {
        public static void main(String[] args) {
        /*String[] str_array = {"Maak", "van", "deze", "string","een","char","array"};
        StringBuilder str=new StringBuilder();
        for(int i=0;i<str_array.length;i++){
            str.append(str_array[i]).append((" "));
        }
        String newstr=str.toString();
        System.out.println(newstr);*/

            String str = "Make this string a char array";
            char[] charArray = new char[str.length()];
            for (int i = 0; i < str.length(); ++i) {
                charArray[i] = str.charAt(i);
            }
            System.out.println(charArray);

        }
    }
