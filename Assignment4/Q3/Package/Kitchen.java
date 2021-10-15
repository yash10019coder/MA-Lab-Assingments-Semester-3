package Assingment4.Q3.Package;

import Assingment4.Q3.Package.House.*;

public class Kitchen extends Room {
    Microwave mw = new Microwave();
    Food f = new Food();

    private class Microwave extends HomeAppliance {
        void repair() {
            System.out.println("Repairing the microwave");
            System.out.println("Microwave is ready to use");
        }

        void useMicrowave() {
            super.switchOn();
            System.out.println("Cooking in the microwave");
            super.switchOff();
        }

    }

    protected class Food {
        private String dishName;

        void setDishName(String name) {
            this.dishName = name;
        }

        void cook() {
            System.out.println("Using Microwave to cook " + dishName);
            mw.useMicrowave();
        }

    }

    public void enter() {
        System.out.println("\nEntering in the Kitchen");
    }

    public void exit() {
        System.out.println("Exiting from the Kitchen\n");
    }

    public void prepareFood(String name) {
        enter();
        f.setDishName(name);
        mw.repair();
        f.cook();
        exit();
    }

}
