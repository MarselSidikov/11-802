package ru.itis.better;

/**
 * 07.11.2018
 * TextProcessor
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TextProcessor {
    String[] process(String[] text, ProcessFunction function) {
        String processedText[] = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            processedText[i] = function.process(text[i]);
        }

        return processedText;
    }
}
