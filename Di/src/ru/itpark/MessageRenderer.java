package ru.itpark;

public class MessageRenderer {
    private Message message;

    public MessageRenderer(Message message) {
        this.message = message;
    }

    public void render() {
        System.out.println(message.getText());
    }
}
