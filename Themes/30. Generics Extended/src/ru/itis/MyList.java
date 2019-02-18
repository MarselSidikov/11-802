package ru.itis;

/**
 * 18.02.2019
 * MyList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface MyList<X> extends Iterable<X> {
    void add(X value);
}
