package ru.itpark.checked;

import java.io.FileNotFoundException;

/**
 * Created by Student21 on 08.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder();
        try {
            folder.openFile("win.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Чет не то");
        }
    }
}
