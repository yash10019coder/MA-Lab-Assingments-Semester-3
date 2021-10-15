import java.util.Scanner;

class Circle {
        int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        Circle circle = new Circle(scanner.nextInt());
        System.out.println("Area of the circle is " + circle.area());
        
        System.out.println("Enter the dimensions of the Rectangle");
        Rectangle rectangle = new Rectangle(scanner.nextInt(),scanner.nextInt());
        System.out.println("Area of the Rectangle is " + rectangle.area());
        scanner.close();
    }
    
}
