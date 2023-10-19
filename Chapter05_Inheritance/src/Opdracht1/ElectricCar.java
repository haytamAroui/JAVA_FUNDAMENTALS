package Opdracht1;
/*
public class ElectricCar extends Car {
        private int battery ;

        public ElectricCar() {
            super();
            this.battery = 100;
        }

        public ElectricCar(String color, int speed, int hp, int battery) {
            super();
            this.battery = battery;
        }


    @Override
    public void setSpeed(int speed, int amount) {
        super.setSpeed(speed, amount);
    }
    public void charge(int amount) {
            this.battery += amount;
        }
    public void park() {
        super.park(0);
    }

        @Override
        public String toString() {
            return "ElectricCar{" +
                    "color='" + getColor() + '\'' +
                    ", speed=" + getSpeed() +
                    ", battery=" + battery +
                    '}';
        }
    }

















/*public class ElectricCar extends Car {

    private int battery;
    private int batteryLevel = 100;

    public ElectricCar(String green) {
        super(green);
    }

    @Override
    public void accelerate(int amount) {
        if (batteryLevel >= 10) {
            super.accelerate(amount + (battery / 100));
            batteryLevel -= 10;
        } else {
            System.out.println("The battery level is too low to accelerate.");
        }
    }

    @Override
    public void slow(int amount) {
        if (speed > 0) {
            super.slow(amount);
        } else {
            System.out.println("The car is already at a standstill.");
        }
    }

    public void charge(int battery) {
        if (batteryLevel < 100) {
            batteryLevel += battery;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
        } else {
            System.out.println("The battery is already fully charged.");
        }
    }

    @Override
    public void park() {
        super.park();
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel ;
    }

    @Override
    public void speed(String model) {
        super.speed(model);
    }
}
*/



/*

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar() {
        super();
        this.battery = 100;
    }

    public ElectricCar(String color, int speed, int hp, int battery) {
        super(color, speed, hp);
        this.battery = battery;
    }

    @Override
    public void accelerate(int amount) {
        this.speed += amount + (this.battery / 100);
    }

    public void charge(int amount) {
        this.battery += amount;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                ", battery=" + battery +
                '}';
    }
}

 */