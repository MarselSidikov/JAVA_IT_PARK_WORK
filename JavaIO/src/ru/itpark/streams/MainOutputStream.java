package ru.itpark.streams;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Student21 on 08.04.2017.
 */
public class MainOutputStream {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream =
                new FileOutputStream("output.txt");

        String helloMessage = "hello!";

        byte helloBytes[] = helloMessage.getBytes();
        outputStream.write(helloBytes);
    }
}
