package Oefening2;

public class MainApp {
    public static void main(String[] args) {

        Car car = new Car(0f, false);

        float gas = car.gas();
        System.out.println("Gas: " + gas);

        car.toggleSwitch();

    }
}
