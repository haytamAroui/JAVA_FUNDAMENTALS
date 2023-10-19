/*
* public class Shape {
    public double area() {
        return 0;
    }
}

public class Triangle extends Shape {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
::::::::::::::::::::::::::
*
*
* Shape triangle = new Triangle(3, 4);
Shape rectangle = new Rectangle(5, 6);
Shape circle = new Circle(7);

System.out.println(triangle instanceof Shape); // true
System.out.println(rectangle instanceof Shape); // true
System.out.println(circle instanceof Shape); // true

* */