package ru.itpark.generator;

import java.io.*;
import java.util.Properties;

public class IdGeneratorInFileImpl implements IdGenerator {

    // чтобы был singleton
    private static IdGeneratorInFileImpl instance;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\application.properties"));
            String idFileName = properties.getProperty("id.file.name");
            instance = new IdGeneratorInFileImpl(idFileName);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private IdGeneratorInFileImpl(String fileName) {
        this.fileName = fileName;
        try {
            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(fileName));
            String lastGeneratedIdFromFile = reader.readLine();
            lastGeneratedId = Integer.parseInt(lastGeneratedIdFromFile);
            reader.close();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static IdGenerator getGenerator() {
        return instance;
    }


    //-------------------

    private int lastGeneratedId;
    private String fileName;



    @Override
    public int nextId() {
        lastGeneratedId = lastGeneratedId + 1;

        try {
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName));
            writer.write(lastGeneratedId + "");
            writer.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return lastGeneratedId;
    }
}
