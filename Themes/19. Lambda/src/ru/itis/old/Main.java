package ru.itis.old;

public class Main {

    public static void main(String[] args) {
        TextProcessor processor = new TextProcessorToLowerCaseImpl();
        String result = processor.process("Привет, Марсель Рафаэлевич!");
        System.out.println(result);

        // анонимный класс

        TextProcessor anonProcessor = new TextProcessor() {
            @Override
            public String process(String text) {
                return text.toUpperCase();
            }
        };

        String result2 = anonProcessor.process("покеда");
        System.out.println(result2);

        TextProcessor lambda = (text) -> {
            return text.replace(' ', '#');
        };

    }
}
