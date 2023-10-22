package Les1.Haytam;

public class Circle extends Shape{
     private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 2;
    }

    @Override
    public double getPerimetre() {
        return radius * Math.PI * 2;    }
}
