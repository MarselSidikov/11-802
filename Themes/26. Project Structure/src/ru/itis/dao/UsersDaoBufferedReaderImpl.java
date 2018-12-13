package ru.itis.dao;

import ru.itis.models.User;
import ru.itis.sequences.IdGenerator;
import ru.itis.sequences.IdGeneratorImpl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 10.12.2018
 * UsersDaoBufferedReaderImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersDaoBufferedReaderImpl implements UsersDao {

    private String fileName;
    private IdGenerator generator;

    public UsersDaoBufferedReaderImpl(String fileName, IdGenerator generator) {
        this.fileName = fileName;
        this.generator = generator;
    }

    @Override
    public void save(User model) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            model.setId(generator.generate());
            writer.write(model.getId() + " " + model.getFirstName() + " " + model.getLastName() + "\n");
            writer.close();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void update(User model) {

    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
