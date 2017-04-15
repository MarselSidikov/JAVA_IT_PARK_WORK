package ru.itpark.reader;

import java.io.*;

/**
 * Created by Student21 on 15.04.2017.
 */
public class Main {
  public static void main(String[] args) {
    try {
      Reader reader = new FileReader("output.txt");
      char characters[] = new char[100];
      reader.read(characters);
      for (int i = 0; i < characters.length; i++) {
        System.out.print(characters[i]);
      }
      reader.close();

      Writer writer = new FileWriter("output.txt");
      characters = "Bye!".toCharArray();
      writer.write(characters);

      writer.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
    } catch (IOException e) {
      System.err.println("IO Exception");
    }
  }
}
