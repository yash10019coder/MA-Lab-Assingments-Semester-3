package tmp;
import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String phone_no;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Phone number: " + phone_no);
    }

    void set_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        this.name = sc.next();
        System.out.print("Enter the roll no.: ");
        this.roll_no = sc.nextInt();
        System.out.print("Enter the phone no.: ");
        this.phone_no = sc.next();
    }
}

class Teacher extends Student {
    String name;
    String teaching_area;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Area of teaching: " + teaching_area);
    }

    void set_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the teacher: ");
        this.name = sc.next();
        System.out.print("Enter the area of teaching: Should be either science or arts or commerce");
        this.teaching_area = sc.next();

        if (teaching_area.equalsIgnoreCase("Science") ) {
            System.out.println("Science called");
            Science s = new Science();
            s.set_no();
            s.get_no();
        } else if (teaching_area == "Arts" || teaching_area == "arts") {
            Arts a = new Arts();
            a.set_no();
            a.get_no();
        } else if (teaching_area == "Commerce" || teaching_area == "commerce") {
            Commerce s = new Commerce();
            s.set_no();
            s.get_no();
        } else {
            System.out.println(this.teaching_area + " Hmmmmmmmmmmm");
        }
    }

    class Science {
        int student_no;

        void set_no() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students in science: ");
            this.student_no = sc.nextInt();
        }

        void get_no() {
            System.out.println("The number of students in science is " + this.student_no);
        }
    }

    class Arts {
        int student_no;

        void set_no() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students in arts: ");
            this.student_no = sc.nextInt();
        }

        void get_no() {
            System.out.println("The number of students in arts is " + this.student_no);
        }
    }

    class Commerce {
        int student_no;

        void set_no() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of students in commerce: ");
            this.student_no = sc.nextInt();
        }

        void get_no() {
            System.out.println("The number of students in commerce is " + this.student_no);
        }
    }
}

class Staff extends Student {
    String name;
    String work;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Work: " + work);
    }

    void set_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the staff: ");
        this.name = sc.next();
        System.out.print("Enter the work of the staff: ");
        this.work = sc.next();
    }
}

public class Main {
    public static void main(String[] args) {
        int choice;
        char cnt = 'y';
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to enter student info.");
        System.out.println("Press 2 to enter teacher info.");
        System.out.println("Press 3 to enter staff info.");

        while (cnt == 'y') {
            System.out.print("\nYour choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.set_data();
                    System.out.println("So,");
                    student.display();
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    teacher.set_data();
                    teacher.display();
                    break;
                case 3:
                    Staff staff = new Staff();
                    staff.set_data();
                    staff.display();
                    break;
                default:
                    System.out.println("Invalid input");
            }

            System.out.print("Do you want to continue? Press 'y' to continue and 'n' to abort: ");
            cnt = sc.next().charAt(0);
        }
        sc.close();
    }
}
