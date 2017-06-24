package ru.itpark;

/**
 * Created by Student21 on 24.06.2017.
 */
public class StringProcessorDigitsRemovingImpl implements StringProcessor {
    public String process(String source) {
        return source.replaceAll("[0-9]+","");
    }
}
