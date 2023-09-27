package be.intecbrussel.les2;

public class StringBuilderExample {
    public static void main(String[] args) {
        /////////// declaratie /////////////////////////
        StringBuilder str=new StringBuilder("");
        //////initialisatie :Append methode//////////////////////////////
        str.append("hello");
        System.out.println(str);

        ///////////// declaratie en initialisatie ////////////////////////
        StringBuilder name=new StringBuilder("Haytam");
        System.out.println(name);

        ////// insert methode /////////////////////
        StringBuilder str2 = new StringBuilder("walter, mike ");
        str2.insert(13,",edwin");
        System.out.println(str2);

        ///////// toString methode ///////////////////
        StringBuilder str3 = new StringBuilder("hello aa world");
        //String txt = str3.toString();
        System.out.println(str3.toString());

        ///////// reverse methode /////////////////
        StringBuilder str4 = new StringBuilder("hello world!");
        System.out.println(str4.reverse());

    }
}
