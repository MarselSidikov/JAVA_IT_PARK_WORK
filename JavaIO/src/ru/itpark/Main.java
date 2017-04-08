package ru.itpark;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        System.err.println("bye");

        int byteFromSystemIn = System.in.read();
        System.out.println(byteFromSystemIn);
        System.out.println((char)(byteFromSystemIn + 1));
    }
}
