package Assingment4.Q2.Car;

import Assingment4.Q2.Vehicle.Vehicle;

public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    public void display() {
        System.out.println("\n\nVehicle Type : Car");
        super.displayModel();
    }
}
