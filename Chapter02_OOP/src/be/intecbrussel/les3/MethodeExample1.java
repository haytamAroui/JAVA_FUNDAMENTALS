package be.intecbrussel.les3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MethodeExample1 {
    public static void main(String[] args) {

        //////// Methode abs /////////////
        int result1=Math.abs(-10);
        System.out.println("with abs methode " +result1);

        /////// Methode round///////
        int result2=Math.round(4.6F);
        System.out.println("with round methode " +result2);
        //////// Methode Math.max/min ////////////////////////
        int result3=Math.max(10,9);
        double result4=Math.max(10.3,9.6);
        long result5=Math.max(17L,8L);
        float result6=Math.max(8F,30.5F);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(Math.min(3L,5.8f));
        System.out.println(Math.min(10L,5.8D));
        System.out.println(Math.min(7,5));

        ///////////// Methode ceil////////////

        double result7 = Math.ceil(4.1);
        System.out.println(result7);

        ///////////// Methode floor////////////

        double result8 = Math.floor(8.9);
        System.out.println(result8);

        ///////////// Methode random////////////
        double result9 = Math.random();
        System.out.println(result9);

        double result10 = (Math.random() * 10);
        System.out.println(result10);

        ///////////// Methode pow////////////
        double result11 = Math.pow(2,3);
        System.out.println(result11);
    }

}
