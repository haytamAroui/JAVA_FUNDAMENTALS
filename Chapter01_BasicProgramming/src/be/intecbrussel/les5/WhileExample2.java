package be.intecbrussel.les5;

public class WhileExample2 {
    public static void main(String[] args) {
        int x=1 , sum=0;
        while(x<=10)
        {
            sum=x+sum;
            x++;
        }
        System.out.println("Summation: "+sum);
    }
}
