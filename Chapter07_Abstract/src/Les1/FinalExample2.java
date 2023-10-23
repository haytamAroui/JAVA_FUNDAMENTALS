package Les1;

public class FinalExample2 {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("intec");
        System.out.println("Before the change:" + sb);
        sb.append("Brussel");
        System.out.println("After the change :"+sb);
    }
}
