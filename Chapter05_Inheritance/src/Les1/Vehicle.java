package Les1;

public class Vehicle {
   private String typeOfVehicle="Car";
   public String getTypeOfVehicle(){
       return typeOfVehicle;
   }
    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }
    public void honk() {
        System.out.println("Toet toet");
    }
    public Vehicle() {
        System.out.println("Vehicle class constructor");
    }
}
