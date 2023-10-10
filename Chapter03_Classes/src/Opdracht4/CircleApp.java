package be.intecbrussel.les1.Opdracht4;

        public class CircleApp {
            public static void main(String[] args) {
                Circle circle1 = new Circle(5, 10, 15);
                System.out.println("Circle1: ");
                System.out.println("x: " + circle1.getX());
                System.out.println("y: " + circle1.getY());
                System.out.println("radius: " + circle1.getRadius());
                System.out.println("area: " + circle1.getArea());
                System.out.println("perimeter: " + circle1.getPerimeter());

                Circle circle2 = new Circle();
                circle2.setRadius(10);
                circle2.setX(20);
                circle2.setY(25);
                System.out.println("\nCircle2: ");
                System.out.println("x: " + circle2.getX());
                System.out.println("y: " + circle2.getY());
                System.out.println("radius: " + circle2.getRadius());
                System.out.println("area: " + circle2.getArea());
                System.out.println("perimeter: " + circle2.getPerimeter());

                Circle circle3 = new Circle(circle1);
                System.out.println("\nCircle3: ");
                System.out.println("x: " + circle3.getX());
                System.out.println("y: " + circle3.getY());
                System.out.println("radius: " + circle3.getRadius());
                System.out.println("area: " + circle3.getArea());
                System.out.println("perimeter: " + circle3.getPerimeter());

                circle1.grow(5);
                System.out.println("\nCircle1 after growth by 5 units: ");
                System.out.println("radius: " + circle1.getRadius());

            }
        }
