package Assingment4.Q1.MCA;

public class Student {
    String name;
    int rollNo;
    float marks[];

    public Student(String name, int rollNo, float m[]) {
        this.name = name;
        this.rollNo = rollNo;
        marks = new float[5];
        marks = m;
    }

    public void display() {
        System.out.println(" ---- Student Details ---- ");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks in Subject " + (i + 1) + " : " + marks[i]);
        }
        totalMarks();
        percentage();
        System.out.print("\n\n");
    }

    void totalMarks() {
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Total Marks : " + sum + " out of 500");
    }

    void percentage() {
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("Percentage : " + (sum / 500 * 100) + "%");
    }

}
