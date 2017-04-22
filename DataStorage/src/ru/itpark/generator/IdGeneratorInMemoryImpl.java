package ru.itpark.generator;

public class IdGeneratorInMemoryImpl implements IdGenerator {
    private int lastGeneratedId;

    public IdGeneratorInMemoryImpl() {
        lastGeneratedId = -1;
    }

    @Override
    public int nextId() {
        lastGeneratedId = lastGeneratedId + 1;
        return lastGeneratedId;
    }
}
