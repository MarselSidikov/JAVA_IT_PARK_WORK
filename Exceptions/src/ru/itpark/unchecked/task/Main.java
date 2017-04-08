package ru.itpark.unchecked.task;

import java.util.Scanner;

/**
 * Created by Student21 on 08.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Verifier verifier = new Verifier();
        while (true) {
            String passwordCandidate
                    = scanner.nextLine();
            try {
                verifier.verify(passwordCandidate);
                return;
            } catch (PasswordException e) {
                System.err.println("Введите пароль заново");
            }
        }
    }
}
