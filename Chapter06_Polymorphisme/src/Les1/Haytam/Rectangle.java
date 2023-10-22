package Les1.Haytam;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double length, double width) {
        this.height = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimetre() {
        return 2 * (width + height) ;
    }


}
