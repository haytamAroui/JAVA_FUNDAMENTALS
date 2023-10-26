package Oefening5;

import Oefening4.Battery;

public class MainApp {
    public static void main(String[] args) {
        Battery flashlight1 = new Flashlight(new DuracelDoubleA());
        Battery flashlight2 = new Flashlight(new VartaDoubleA());
        System.out.println(flashlight1.getBatteryType());
        System.out.println(flashlight2.getBatteryType());
    }
    }

