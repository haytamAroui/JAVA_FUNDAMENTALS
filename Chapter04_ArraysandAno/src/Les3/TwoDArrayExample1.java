package Les3;

public class TwoDArrayExample1 {
    public static void main(String[] args) {
        int[][] myArr = new int[2][5];
        myArr[0][0] = 1;
        myArr[0][1] = 2;
        myArr[0][2] = 3;
        myArr[0][3] = 4;
        myArr[0][4] = 5;
        myArr[1][0] = 10;
        myArr[1][1] = 20;
        myArr[1][2] = 30;
        myArr[1][3] = 40;
        myArr[1][4] = 50;
        System.out.println(("arr[][]="+myArr[0][0]));
        System.out.println(("arr[][]="+myArr[1][4]));

    }
}
