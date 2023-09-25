package be.intecbrussel.les4.Oefening;

public class oefening3 {
    public static void main(String[] args) {
        String month = "maart";
        int daysCount = 0;

        switch (month) {
            case "januari":
            case "maart":
            case "mei":
            case "juli":
            case "augustus":
            case "october":
            case "november":
                daysCount=31;

                    System.out.println("Het aantal dagen in "+month +" is " +daysCount);

                break;
            case "april":
            case "juni":
            case "september":
            case "december":
                daysCount=30;
                    System.out.println("Het aantal dagen in "+month +"is" +daysCount);

                break;

            case "februari":
                daysCount=28;
                    System.out.println("Het aantal dagen in "+month +"is" +daysCount);


            default:
                System.out.println("ongieldige maad");


        }

    }
}