package Oefening2;

//Provide a check that you can only accelerate when the car is on, a toggleSwitch().
public class Car implements Switch1,Motor {
    private float gas = 0f;
    private boolean toggleSwitch = false;

    public Car(float gas, boolean toggleSwitch) {
        this.gas = gas;
        this.toggleSwitch = toggleSwitch;
    }

    @Override
    public float gas() {
        return gas;
    }

    @Override
    public boolean toggleSwitch() {
        if (toggleSwitch) {
            gas++;
        } else {
            System.out.println("Car is not on");
        }
        return toggleSwitch;
    }
}
