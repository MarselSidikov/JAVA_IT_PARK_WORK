package ru.itpark;


public class MainInitialize {

    /*
    public static double calcAverage(Student student) {
        double sum = 0;
        for (int i = 0; i < student.marks.length; i++) {
            sum = sum + student.marks[i];
        }
        double average = sum / student.marks.length;

        return average;
    }
    */
    public static void main(String[] args) {
        // new - оператор инстантивации
        // Student() - конструктор
        Student regina = new Student();
        Student alina =
                new Student("Alina", 18);
        alina.marks = new int[]{5, 5, 4};
        regina.marks = new int[]{3, 5, 5};

        //double alinaAverage = calcAverage(alina);
        double alinaAverage = alina.calcAverage();
        double reginaAverage = regina.calcAverage();

        System.out.println("Average Alina: " + alinaAverage);
        System.out.println("Average Regina: " + reginaAverage);
        alina.age = -10;

        int i = 0;
    }
}
