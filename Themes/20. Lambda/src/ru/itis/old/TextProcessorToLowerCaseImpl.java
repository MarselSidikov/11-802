package ru.itis.old;

/**
 * 07.11.2018
 * TextProcessorToLowerCaseImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TextProcessorToLowerCaseImpl implements TextProcessor {
    @Override
    public String process(String text) {
        char textArray[] = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (!Character.isLowerCase(textArray[i])) {
                textArray[i] = Character.toLowerCase(textArray[i]);
            }
        }
        return new String(textArray);
    }
}
