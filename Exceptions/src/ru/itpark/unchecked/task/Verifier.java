package ru.itpark.unchecked.task;

/**
 * Created by Student21 on 08.04.2017.
 */
public class Verifier {
    public void verify(String password) {
        if (password.length() < 6) {
            throw new PasswordException();
        }
    }
}
