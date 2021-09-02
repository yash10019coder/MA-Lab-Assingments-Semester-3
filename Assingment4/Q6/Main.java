package Assingment4.Q6;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Suresh Khatri", 25000f, "9876 1234");
        Employee e2 = new Employee("Kashish Singh", 35050.75f, "2345 5678");
        e1.addSalary(12000);
        e2.addSalary(24000);
        System.out.println();
        e1.showEmployeeDetails();
        System.out.println();
        e2.showEmployeeDetails();
    }
}
