package ru.itpark.objects;


public class Student {
    // поля
    String name;
    int age;
    boolean passed;
    int marks[];

    Student() {
        age = 1;
        name = "DEFAULT NAME";
        passed = false;
        marks = new int[2];
    }

    Student(String studentName, int studentAge) {
        age = studentAge;
        name = studentName;
    }

    double calcAverage() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double average = sum / marks.length;

        return average;
    }

}
