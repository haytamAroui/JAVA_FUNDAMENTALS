package Oefening1;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        // Call the makeSound() method on each animal
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
