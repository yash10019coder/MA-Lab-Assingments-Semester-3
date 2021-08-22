import java.util.Scanner;

class Student {
    private String name;
    private int roll_no;
    private int phone_no;

    public Student() {
        this.name = "";
        this.roll_no = 0;
        this.phone_no = 0;
    }

    public Student(String name, int roll_no, int phone_no) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
    }

    public void inputStudentData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter roll no: ");
        roll_no = sc.nextInt();
        System.out.println("Enter phone no: ");
        phone_no = sc.nextInt();
    }

    public void displayStudentData() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Phone no: " + phone_no);
    }
}

class Teacher extends Student {
    String name;
    String area_of_teaching;

    // Two methods for taking inputs and displaying data
    public Teacher() {

    }

    public void inputTeacherData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter area of teaching: ");
        area_of_teaching = sc.nextLine();
    }

    public void displayTeacherData() {
        System.out.println("Name: " + name);
        System.out.println("Area of teaching: " + area_of_teaching);
    }
}

class Science extends Teacher {
    int number_of_student;
    // Two methods for taking inputs and displaying data
    public Science() {
    }

    public void inputScienceData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        number_of_student = sc.nextInt();
    }

    public void displayScienceData() {
        System.out.println("Number of student: " + number_of_student);
    }
}

class Arts extends Teacher {
    int number_of_student;
    // Two methods for taking inputs and displaying data
    public Arts() {
    }

    public void inputArtsData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        number_of_student = sc.nextInt();
    }

    public void displayArtsData() {
        System.out.println("Number of student: " + number_of_student);
    }
}

class Commerce extends Teacher {
    int number_of_student;
    // Two methods for taking inputs and displaying data
    public Commerce() {
    }

    public void inputCommerceData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        number_of_student = sc.nextInt();
    }
}
class Staff extends Student {
    String name;
    String work;

    // Two methods for taking inputs and displaying data
    public Staff() {
    }

    public Staff(String name, String work){
        this.name = name;
        this.work = work;        
    }
    public void inputStaffData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter work: ");
        work = sc.nextLine();
    }

    public void displayStaffData() {
        System.out.println("Name: " + name);
        System.out.println("Work: " + work);
    }
}