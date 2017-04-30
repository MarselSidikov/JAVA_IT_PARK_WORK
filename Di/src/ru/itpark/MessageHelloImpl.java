package ru.itpark;

public class MessageHelloImpl implements Message{
    @Override
    public String getText() {
        return "Hello";
    }
}
