package Les1.Haytam;

import java.util.Arrays;

public class ShapApp {
    public static void main(String[] args) {
     /*   Circle circle = new Circle(5);
        System.out.printf("Circle : The area is = %.2f\nCircle : The perimeter is = %.2f\n", circle.getArea(), circle.getPerimetre());

        Square square = new Square(5);
        System.out.printf("Square : The area is = %.2f\nSquare : the perimetre is = %.2f\n ", square.getArea(),square.getPerimetre());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.printf("Rectangle : The area is = %.2f\nRectangle : the perimetre is = %.2f\n ", rectangle.getArea(),rectangle.getPerimetre());
*/

        Shape[] shapes = {new Circle(5), new Square(5), new Rectangle(10,5)};
        for (Shape shape: shapes) {
            System.out.println(shape instanceof Shape);
        }
        for (Shape shape: shapes ) {
            if (shape instanceof Circle) {
                Circle circle = new Circle(5);
                System.out.printf("Circle : The area is = %.2f\nCircle : The perimeter is = %.2f\n", circle.getArea(), circle.getPerimetre());
            }
            if (shape instanceof Square) {
                Square square = new Square(5);
                System.out.printf("Square : The area is = %.2f\nSquare : the perimetre is = %.2f\n ", square.getArea(),square.getPerimetre());
            }
            if (shape instanceof Rectangle) {
                Rectangle rectangle = new Rectangle(5, 10);
                System.out.printf("Rectangle : The area is = %.2f\nRectangle : the perimetre is = %.2f\n ", rectangle.getArea(),rectangle.getPerimetre());

            }
        }

    }

}

