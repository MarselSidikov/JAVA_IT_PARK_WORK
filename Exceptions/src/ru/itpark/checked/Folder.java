package ru.itpark.checked;

import java.io.FileNotFoundException;

public class Folder {
    private String files[];

    public Folder() {
        files = new String[]{"human.txt",
                "marsel.txt",
                "venom.bin"};
    }

    public void openFile(String fileName) throws FileNotFoundException {
        for (int i = 0; i < files.length; i++) {
            if (files[i].equals(fileName)) {
                System.out.println(fileName + " opened");
                return;
            }
        }

        throw new FileNotFoundException(fileName + " not exist");
    }
}
