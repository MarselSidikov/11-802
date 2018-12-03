package ru.itis;

import java.time.LocalDateTime;

/**
 * 01.10.2018
 * Logger
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Logger {
    // объектная переменная, которая хранит единственный экземпляр объекта
    private static Logger instance;

    static {
        instance = new Logger();
    }
    public static Logger getLogger() {
        return instance;
    }

    private static final String PREFIX = "LOGGER ";

    private Logger() {

    }

    public void log(String message) {
        System.out.println(PREFIX + " " + LocalDateTime.now() + " " + message);
    }
}
