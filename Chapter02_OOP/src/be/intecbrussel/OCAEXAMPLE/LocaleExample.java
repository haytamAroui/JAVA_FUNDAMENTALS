package be.intecbrussel.OCAEXAMPLE;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale local=new Locale("ar","SA");
        double nomber=1_565.44;
        NumberFormat numberformat=NumberFormat.getNumberInstance(local);
        System.out.println("nombre : "+numberformat.format(nomber));
        NumberFormat currformat=NumberFormat.getCurrencyInstance(local);
        System.out.println("currency : "+ currformat.format(nomber) );
        NumberFormat intformat=NumberFormat.getIntegerInstance();
        System.out.println("Integer :"+ intformat.format(nomber));
    }
}
