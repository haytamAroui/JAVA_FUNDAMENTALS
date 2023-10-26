package Oefening5;

import Oefening4.Battery;
private Battery battery;
public class Flashlight implements Battery {

    @Override
    public int deliverPower() {
        return 0;
    }

    public Flashlight(Battery battery) {
        this.battery=battery;
    }

    public String getBatterytype() {
        return battery.getBattery();
    }
}
