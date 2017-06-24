package ru.itpark;

/**
 * Created by Student21 on 24.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessorDigitsRemovingImpl();
        String result = stringProcessor.process("Hello, 123, Bye");
        System.out.println(result);

        StringProcessor anonStringProcessor = new StringProcessor() {
            public String process(String source) {
                return source.replaceAll("[a-z]+","");
            }
        };

        String result2 = anonStringProcessor.process("Hello, 123, Bye");
        System.out.println(result2);

        /*
        StringProcessor lambdaStringProcessor = source -> {
            return source.replaceAll("[A-H]+", "");
        };
        */
        StringProcessor lambdaStringProcessor = source -> source.replaceAll("[A-H]+", "");
        String result3 = lambdaStringProcessor.process("Hello, 123, Bye");
        System.out.println(result3);
    }
}
