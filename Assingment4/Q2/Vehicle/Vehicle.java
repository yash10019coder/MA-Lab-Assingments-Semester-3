package Assingment4.Q2.Vehicle;

public class Vehicle {
    String modelName;

    protected Vehicle(String modelName) {
        this.modelName = modelName;
    }

    protected void displayModel() {
        System.out.println("Model : " + modelName);
    }
}
