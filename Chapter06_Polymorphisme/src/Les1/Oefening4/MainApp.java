package Les1.Oefening4;
public class MainApp {
    public static void main(String[] args) {

        Vehicles car1 = new Car1();
        Vehicles car2= new Car2();
        Vehicles car3= new Car3();

        // Upcasting

        car1.model();
        car2.model();
        car3.model();

        // Downcasting

        Car1 c1 = (Car1) car1;
        c1.color = "green";
        c1.model();
        System.out.println("the color is " +c1.color);



        Car2 c2 = (Car2) car2;
        c2.model();
        c2.color = "Black";
        System.out.println("the color is " +c2.color);



        Car3 c3 = (Car3) car3;
        c3.model();
        c3.color = "red";
        System.out.println("the color is " +c3.color);
    }
}



