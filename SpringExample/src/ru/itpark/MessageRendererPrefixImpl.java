package ru.itpark;

/**
 * Created by Student21 on 13.05.2017.
 */
public class MessageRendererPrefixImpl implements MessageRenderer {

    private String prefix;
    private Message message;

    public MessageRendererPrefixImpl(String prefix, Message message) {
        this.prefix = prefix;
        this.message = message;

    }

    @Override
    public void render() {
        System.out.println(prefix + " " + message.getText());
    }
}
