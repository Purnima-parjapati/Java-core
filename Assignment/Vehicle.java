package Assignment;

// Base class Vehicle
public class Vehicle {
    void start(){
        System.out.println("Vehicle started");
    }

}
// Subclass Motorcycle and car extending Vehicle
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println(" Car started");
    }
}

class Motorcycle extends Vehicle{
    @Override
    void start() {
        System.out.println("Motorcycle started");
    }
}

class Garage {
    // Method to service any Vehicle
    void serviceVehicle(Vehicle vehicle){
       vehicle.start();
        System.out.println("vehicle serviced");
    }
}
class show {

    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Garage garage = new Garage();

        garage.serviceVehicle(car);

        garage.serviceVehicle(motorcycle);

    }
}
