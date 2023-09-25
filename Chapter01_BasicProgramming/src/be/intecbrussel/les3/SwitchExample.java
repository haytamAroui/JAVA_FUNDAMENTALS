package be.intecbrussel.les3;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 14;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sanday");
                break;
            default:
                System.out.println("Day number doesn't exists");

        }

    }
}
