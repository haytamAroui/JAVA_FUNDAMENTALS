package Les1;

public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("this vehicle is an:" + myCar.getTypeOfVehicle() + "\n the brand is :" + myCar.getBandName());
        myCar.sound();
        myCar.honk();
    }

}
