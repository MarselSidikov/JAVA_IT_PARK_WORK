package ru.itpark.security.utils;

import org.springframework.security.oauth2.common.util.RandomValueStringGenerator;
import org.springframework.stereotype.Component;

@Component
public class TokenGeneratorImpl implements TokenGenerator {

    private final int TOKEN_LENGTH = 20;
    private RandomValueStringGenerator generator = new RandomValueStringGenerator(TOKEN_LENGTH);
    @Override
    public String generate() {
        return generator.generate();
    }
}
