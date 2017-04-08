package ru.itpark;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Student21 on 08.04.2017.
 */
public class MainInputStream {
    public static void main(String[] args) {
        try {
            InputStream inputStream =
                    new FileInputStream("input.txt");
            int byteFromFile = inputStream.read();
            System.out.println((char)byteFromFile);

            byte bytesFromFile[] = new byte[40];
            inputStream.read(bytesFromFile);

            for (int i = 0; i < bytesFromFile.length; i++) {
                System.out.print((char)bytesFromFile[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Проблемы с чтением");
        }
    }
}
