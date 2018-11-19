package ru.itis.better;

import java.util.Arrays;

/**
 * 07.11.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        TextProcessor processor = new TextProcessor();
        String[] mainText = {"Марсель", "верни", "сотку"};

        ProcessFunction upperCaseFunction = new ProcessFunction() {
            @Override
            public String process(String string) {
                return string.toUpperCase();
            }
        };

        String result1[] = processor.process(mainText, upperCaseFunction);

        ProcessFunction lowerCaseFunction = (text) -> {
            return text.toLowerCase();
        };

        String result2[] = processor.process(mainText, lowerCaseFunction);

        String result3[] = processor.process(mainText, text -> text.concat(" эй"));

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
