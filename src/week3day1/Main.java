package week3day1;

import java.util.ArrayList;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

   public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20, 95.0));
        students.add(new Student("Bob", 22, 87.5));
        students.add(new Student("Charlie", 21, 91.2));
        students.add(new Student("David", 19, 82.8));

        double totalGrade = 0.0;
        for (Student student : students) {
            totalGrade += student.grade;
        }
        double averageGrade = totalGrade / students.size();
        System.out.println("Average grade: " + averageGrade);

        System.out.println("Students with grade higher than 90:");
        for (Student student : students) {
            if (student.grade > 90) {
                System.out.println("Name: " + student.name + ", Age: " + student.age);
            }
        }
    }
}