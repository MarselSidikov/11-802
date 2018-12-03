package ru.itis.custom;

/**
 * 21.11.2018
 * BadWordException
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class BadWordException extends RuntimeException {
    public BadWordException(String message) {
        super(message);
    }
}
