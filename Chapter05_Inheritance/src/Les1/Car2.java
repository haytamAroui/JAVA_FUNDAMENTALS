package Les1;

public class Car2 extends Vehicle2 {

    public Car2() {
        System.out.println("No args constructor Car");
    }
    // This will be executed third
    Car2(String typeOfVehicle) {
        super(typeOfVehicle);
        System.out.println("Car constructor");
    }
}

