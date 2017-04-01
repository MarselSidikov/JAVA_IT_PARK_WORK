package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Cat cat = new Cat(3, "Murka");
	    cat.eat(2);
        System.out.println("Cat weight: " + cat.getWeight());

        Koala koala = new Koala(10, "Stalone", 10);
        koala.sleep(5);
        System.out.println("Koala hours of sleep: " + koala.getSleepingHours());
        koala.eat(2);
        System.out.println("Koala weight: " + koala.getWeight());

        Animal animal = koala;
        animal.eat(1);
        System.out.println("Koala as animal weight: " + animal.getWeight());
    }
}
