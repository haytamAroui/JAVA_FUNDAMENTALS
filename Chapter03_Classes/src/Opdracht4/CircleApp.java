package be.intecbrussel.les1.Opdracht4;
public class CircleApp {
    public static void main(String[] args) {

        Circle cirkel = new Circle(10);
        System.out.println("The x coordinate of the circle is: " + cirkel.getX());

        cirkel.setX(5);

        System.out.println("The x coordinate of the circle is now: " + cirkel.getX());
        System.out.println("The radius of the circle is : " + cirkel.getRadius());

        cirkel.grow(5);

        System.out.println("The radius of the circle is now: " + cirkel.getRadius());
        System.out.println("The area of the circle is: " + cirkel.getArea());
        System.out.println("The circumference of the circle is: " + cirkel.getPerimeter());

    }

}
/*// Maak een nieuwe cirkel met een straal van 10
        Circle cirkel = new Circle(10);

        // Print de x-coördinaat van de cirkel
        System.out.println("De x-coördinaat van de cirkel is: " + cirkel.getX());

        // Stel de x-coördinaat van de cirkel in op 5
        cirkel.setX(5);

        // Print de x-coördinaat van de cirkel opnieuw
        System.out.println("De x-coördinaat van de cirkel is nu: " + cirkel.getX());

        // Print de straal van de cirkel
        System.out.println("De straal van de cirkel is: " + cirkel.getRadius());

        // Vergroot de straal van de cirkel met 5
        cirkel.grow(5);

        // Print de straal van de cirkel opnieuw
        System.out.println("De straal van de cirkel is nu: " + cirkel.getRadius());

        // Print het oppervlak van de cirkel
        System.out.println("Het oppervlak van de cirkel is: " + cirkel.getArea());

        // Print de omtrek van de cirkel
        System.out.println("De omtrek van de cirkel is: " + cirkel.getPerimeter());

    }

}*/