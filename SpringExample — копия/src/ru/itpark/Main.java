package ru.itpark;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ru.itpark\\context.xml");


        // Message message = (Message) context.getBean("message");
        //Message message = context.getBean(Message.class);
        //MessageRenderer renderer = new MessageRendererPrefixImpl("Marsel", message);

        MessageRenderer renderer = context.getBean(MessageRenderer.class);
        renderer.render();
    }
}
