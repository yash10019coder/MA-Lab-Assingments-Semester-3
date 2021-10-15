package Assingment4.Q5.Package;

public class C {
    D d = new D();

    private class D {
        void print() {
            System.out.println("In private class : D");
        }
    }

    public void print() {
        System.out.println("In public class : C");
        System.out.println("Calling 'print()' method of private class from this class -> ");
        d.print();
    }
}
