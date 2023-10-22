package Les1.Haytam;

public class Shape {
    private double area;
    private double perimetre;

    public  Shape() {
        this.area = area;
        this.perimetre = perimetre;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetre() {
        return perimetre;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetre(double perimetre) {
        this.perimetre = perimetre;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimetre=" + perimetre +
                '}';
    }
}
