package ru.itpark.dao;

import ru.itpark.generator.IdGenerator;
import ru.itpark.models.Human;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HumansDaoIoImpl implements HumansDao {

    private String fileName;
    private IdGenerator idGenerator;

    public HumansDaoIoImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public int save(Human model) {
        int newId = idGenerator.nextId();
        model.setId(newId);

        String modelAsString = model.toString();

        try {
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter(fileName, true));

            writer.write(modelAsString);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return newId;
    }

    @Override
    public Human find(int id) {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentHumanAsString = reader.readLine();

            while (currentHumanAsString != null) {
                String currentHumanAsStringArray[]
                        = currentHumanAsString.split(" ");

                int humanId
                        = Integer.parseInt(currentHumanAsStringArray[0]);

                if (humanId == id) {
                    Human foundedHuman = new Human(
                            humanId,
                            currentHumanAsStringArray[1],
                            Integer.parseInt(currentHumanAsStringArray[2])
                    );
                    reader.close();
                    return foundedHuman;
                }

                currentHumanAsString = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        return null;
    }

    @Override
    public void update(Human model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public LinkedList<Human> findAll() {
        return null;
    }
}
