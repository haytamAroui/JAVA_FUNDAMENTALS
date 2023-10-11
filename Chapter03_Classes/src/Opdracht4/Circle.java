package be.intecbrussel.les1.Opdracht4;

public class Circle {

    public static int ANGLES = 0;
    private int count;
    private int x;
    private int y;
    private int radius;

    public Circle() {
        this.count = 0;
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(int radius) {
        this.count = 0;
        this.x = 0;
        this.y = 0;
        this.radius = radius;
    }

    public Circle(int radius, int x, int y) {
        this.count = 0;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle c) {
        this.count = c.count;
        this.x = c.x;
        this.y = c.y;
        this.radius = c.radius;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void grow(int d) {
        this.radius += d;
    }

    public int getCount() {
        return this.count;
    }

}

