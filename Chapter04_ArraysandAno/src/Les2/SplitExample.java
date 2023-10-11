package Les2;
// string to array
public class SplitExample {
    public static void main(String[] args) {
        String myStr = "java is the best";
        String[] strArray = myStr.split(" ");
        System.out.println("String:" + myStr);
        for (int i = 0; i < strArray.length; ++i) {
            System.out.println("index" + i + "value of element: " + strArray[i]);
        }
    }
}
