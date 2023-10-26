package Oefening3;

import Oefening2.Motor;
import Oefening2.Switch1;

public interface Vehicle extends Switch1, Motor {
    void openDoor(int door);

    void closeDoor(int door);

}
