package Les1;

public class Car extends Vehicle {
    private String bandName = "Audi";

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void honk() {
        System.out.println("Tuut tuut");
    }

    public void sound() {
        super.honk();
    }

    public Car() {
        super();
        System.out.println("Car class constructor");
    }


}
