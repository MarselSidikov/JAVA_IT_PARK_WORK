package ru.itpark;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageFactory {
    private Properties properties;

    public MessageFactory() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\app.properties"));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    // получение объекта, который реализует интерфейс Message
    public Message getMessage() {
        // получаем имя класса из файла конфигурации
        String messageClassName = properties.getProperty("message.class");
        try {
            // получаем класс как объект
            Class<Message> messageClass = (Class<Message>) Class.forName(messageClassName);
            // получаем экземпляр класса
            Message message = messageClass.newInstance();
            return message;
        } catch (ReflectiveOperationException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
