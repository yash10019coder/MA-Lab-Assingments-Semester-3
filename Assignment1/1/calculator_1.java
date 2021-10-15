import java.util.Scanner;

class calculator_1 {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        System.out.println("***************Welcome to calculator*******************************");
        System.out.println(
                "Enter 1 for Adding two numbers\nEnter 2 for Subtracting two numbers\nEnter 2 for Multiplying two numbers\nEnter 3 for Divide two numbers\nEnter 4 for operating & operation on two numbers\nEnter 5 for operating | operation on two numbers\nEnter 6 for operating ~ operation on a number");
        int choice = -1;
        System.out.println("Enter your choice");
        while (choice < 1 || choice > 7) {
            // outer: {
            // in: {
            choice = br.nextInt();
            double x = 0, y = 0;
            int a = 0, b = 0;
            if (choice <= 4 && choice >= 1) {
                System.out.println("Enter the two numbers");
                x = br.nextDouble();
                y = br.nextDouble();
            } else if (choice == 5 || choice == 6) {
                System.out.println("Enter two numbers");
                a = br.nextInt();
                b = br.nextInt();
            } else if (choice == 7) {
                System.out.println("Enter a number");
                a = br.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println("X + Y = " + (x + y));
                    break;
                case 2:
                    System.out.println("X - Y = " + (x - y));
                    break;
                case 3:
                    System.out.println("X x Y = " + (x * y));
                    break;
                case 4:
                    System.out.println("X / Y = " + (x / y));
                    break;
                case 5:
                    System.out.println("X & Y = " + (a & b));
                    break;
                case 6:
                    System.out.println("X | Y = " + (a | b));
                    break;
                case 7:
                    System.out.println("~ X = " + (~a));
                default:
                    System.out.println("Enter a correct choice");
            }
        }
        // }
        br.close();
    }
}
