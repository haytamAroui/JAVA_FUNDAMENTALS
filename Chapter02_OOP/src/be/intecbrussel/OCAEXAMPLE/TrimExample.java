package be.intecbrussel.OCAEXAMPLE;

public class TrimExample {
    public static void main(String[] args) {
        String a="abc      ";
        String b=a.toUpperCase().trim().replace("B","2").replace("C","3");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        StringBuilder sb=new StringBuilder("haytam");
        sb.append("+middle");
        StringBuilder same=sb.append("+end");
        System.out.println(sb);



    }
}
