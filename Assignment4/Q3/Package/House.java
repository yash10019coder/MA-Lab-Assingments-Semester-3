package Assingment4.Q3.Package;

public interface House {
    public abstract class HomeAppliance {

        public void switchOn() {
            System.out.println("Appliance is switched ON");
        }

        public void switchOff() {
            System.out.println("Appliance is switched OFF");
        }
    }

    public abstract class Room {
        public void enter() {
            System.out.println("Entering in the room");
        }

        public void exit() {
            System.out.println("Exiting from the room");
        }
    }

    public abstract class Person {
        public void walk() {
            System.out.println("The person is walking");
        }

        public void eat() {
            System.out.println("The person is eating");
        }

        public void sleep() {
            System.out.println("The person is sleeping");
        }
    }
}
