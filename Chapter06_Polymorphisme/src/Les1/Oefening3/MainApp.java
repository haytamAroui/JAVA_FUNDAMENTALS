package Les1.Oefening3;

public class MainApp {

    public static void main(String[] args) {

        // Create a circle
        Circle circle = new Circle(5);
        // Print the perimeter and area of the circle
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        System.out.println("Area of circle: " + circle.getArea());

        // Create a square
        Square square = new Square(5);
        // Print the perimeter and area of the square
        System.out.println("Perimeter of square: " + square.getPerimeter());
        System.out.println("Area of square: " + square.getArea());

        // Create a rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        // Print the perimeter and area of the rectangle
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}