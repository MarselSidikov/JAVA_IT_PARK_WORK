package ru.itpark.access;

public class Main {
    public static void main(String[] args) {
        RationalNumber a = new RationalNumber(10, 5);
        // a.m = 0; если m помечен как private, то мы не имеем к нему доступа
        System.out.println(a.getN() + " " + a.getM());

    }
}
