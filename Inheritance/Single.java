package Inheritance;

// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class (inherits Vehicle)
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Inherited method
        myCar.drive(); // Child class method
    }
}

