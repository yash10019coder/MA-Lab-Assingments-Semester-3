package Assingment4.Q1;

import Assingment4.Q1.MCA.*;

public class Main {
    public static void main(String[] args) {
        float m1[] = new float[] { 87f, 70f, 75f, 89.50f, 67.80f };
        float m2[] = new float[] { 89f, 93f, 90f, 95.5f, 97f };
        float m3[] = new float[] { 64.5f, 58f, 70f, 59f, 68f };
        Student s1 = new Student("Saniya Solanki", 34, m1);
        Student s2 = new Student("Madhur Kapadia", 27, m2);
        Student s3 = new Student("Harshdeep Kaur", 19, m3);
        s1.display();
        s2.display();
        s3.display();

    }
}
