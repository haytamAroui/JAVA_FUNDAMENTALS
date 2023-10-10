package Les1;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] myFirstArray=new int[10];
        int[] mySecondArray={10,20,30,40,50};
        int[] myArrIsNotFull=new int[5];
        myArrIsNotFull[1]=100;
        myArrIsNotFull[2]=1000;
        myArrIsNotFull[3]=250;
        System.out.println(myArrIsNotFull[1]);
        System.out.println(myArrIsNotFull[2]);
        System.out.println(myArrIsNotFull[3]);
    }
}
