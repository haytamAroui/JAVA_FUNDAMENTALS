package Les1;

public class ArraysExample2 {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 100;
        myArr[1] = 200;
        myArr[2] = 300;
        myArr[3] = 400;
        myArr[4] = 500;
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("the number " + myArr[i] + " in the index " + i);
        }
        // each for loop :can't access an index of loop
        for (int ele : myArr) {
            System.out.println("the number is " + ele);
        }

    }
}

