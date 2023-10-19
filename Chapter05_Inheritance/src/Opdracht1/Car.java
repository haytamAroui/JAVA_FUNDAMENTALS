package Opdracht1;
/*public class Car {
    private final String color;
    private int speed;
    private int hp;
    private final String model = "4x4";



    public Car(String color) {
        this.color = color;

    }

    public void accelerate(int amount) {

        //this.speed += amount;
        this.speed=(amount + (hp/100));

    }

    public void slow(int amount) {

        //this.speed -= amount;
        this.speed=(amount - (hp/100));

    }

    public void park() {

        this.speed = 0;
    }

    public String getColor() {

        return color;
    }

    public int getSpeed() {

        return speed;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void speed(String model) {
        this.speed(model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

}
*/

















public class Car {
    private String color;
    private int speed;
    private int hp;
    public Car() {
        this.color = "Black";
        this.speed = 0;
        this.hp = 100;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate(int amount) {
        amount = (amount + (hp / 100));


    }

    public void slow(int amount) {
        amount = (amount - (hp / 100));
    }

    public void park(int amount) {
        park(0);

    }
    public void setSpeed(int speed,int amount) {
            this.speed=speed+amount;
        }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    public void speed(String model) {
        if (!model.equals("4x4")) {
            System.out.println("You drive 4x4 . Max speed is 30 km/h");
        }
    }

}



/*
package cars;

public class Car {

    private String color;
    private int speed;
    private int hp;

    public Car() {
        this.color = "Black";
        this.speed = 0;
        this.hp = 100;
    }

    public Car(String color, int speed, int hp) {
        this.color = color;
        this.speed = speed;
        this.hp = hp;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate(int amount) {
        this.speed += amount + (this.hp / 100);
    }

    public void slow(int amount) {
        this.speed -= amount;
    }

    public void park() {
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
 */
