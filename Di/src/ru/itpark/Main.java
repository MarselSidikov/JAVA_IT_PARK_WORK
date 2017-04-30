package ru.itpark;

public class Main {

    public static void main(String[] args) {
        // Message message = new MessageHelloImpl();
        MessageFactory factory = new MessageFactory();
        Message message = factory.getMessage();
	    MessageRenderer renderer = new MessageRenderer(message);
	    renderer.render();
    }
}
