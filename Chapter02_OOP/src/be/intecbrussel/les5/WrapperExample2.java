package be.intecbrussel.les5;

public class WrapperExample2 {
    public static void main(String[] args) {
        // Primitieve datatypes
        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;
        long myLong = 40;
        float myFloat = 50.0F;
        double MyDouble = 60.0D;
        char myChar = 'a';
        boolean myBoolean = true;

        int numberInInt = 25;
        double numberInDouble = 2.99;
        char notANumber = 'j';

        Integer numberIntger=numberInInt;
        Double  numberDouble=numberInDouble;
        Character IsChar=notANumber;

//Autoboxing: Converting primitieve naar objecten
        Byte byteobj = myByte;
        Short shortobj = myShort;
        Integer intobj = myInt;
        Long longobj = myLong;
        Float floatobj = myFloat;
        Double doubleobj = MyDouble;
        Character charobj = myChar;
        Boolean boolobj = myBoolean;

//Unboxing: Converting Objects to Primitives
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue  =boolobj;
    }
}
