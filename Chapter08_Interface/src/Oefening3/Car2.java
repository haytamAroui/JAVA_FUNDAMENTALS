package Oefening3;

//Please note that the car may not accelerate if a door is open!
    public class Car2 implements Vehicle {
        private int doors=5;


        @Override
        public float gas() {
            return 0;
        }

        @Override
        public boolean toggleSwitch() {
            return false;
        }
        //The doors variable represents the total number of doors on the car,
        // so the door number must be less than or equal to the doors variable.
        @Override
        public void openDoor(int door) {
            if (door <= doors) {
                System.out.println("Door " + door + " is opened.");
            } else {
                System.out.println("Door " + door + " is out of range!");
            }
        }

        @Override
        public void closeDoor(int door) {
            if (door <= doors) {
                System.out.println("Door " + door + " is closed.");
            } else {
                System.out.println("Door " + door + " is out of range!");
            }
        }
    }


