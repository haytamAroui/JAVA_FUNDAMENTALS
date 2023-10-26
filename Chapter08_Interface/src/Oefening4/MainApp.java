package Oefening4;

public class MainApp {
    public static void main(String[] args) {
        Battery[] batteries = {new BatteryA(), new BatteryB(), new BatteryC()};
        for (Battery bat:batteries){
            System.out.println("the power is :"+ bat.deliverPower());
        }
    }
}
