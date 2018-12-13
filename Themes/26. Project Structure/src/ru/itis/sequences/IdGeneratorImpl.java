package ru.itis.sequences;

import java.io.*;
import java.util.Scanner;

/**
 * 10.12.2018
 * IdGeneratorImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class IdGeneratorImpl implements IdGenerator {

    private static final String SEQUENCE_FILE_NAME = "users_id_sequence.txt";
    private static IdGeneratorImpl generator;

    private Long lastGeneratedId;

    static {
        generator = new IdGeneratorImpl();
    }

    private IdGeneratorImpl() {
        try {
            Scanner scanner = new Scanner(new FileInputStream(SEQUENCE_FILE_NAME));
            lastGeneratedId = scanner.nextLong();
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
    @Override
    public Long generate() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(SEQUENCE_FILE_NAME));
            writer.write((++lastGeneratedId).toString());
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return lastGeneratedId;
    }

    public static IdGenerator generator() {
        return generator;
    }
}
