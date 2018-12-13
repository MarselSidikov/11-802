package ru.itis.dao;

/**
 * 10.12.2018
 * CrudDao
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudDao<T> {
    // CREATE
    void save(T model);
    // UPDATE
    void update(T model);
    // READ
    T find(Long id);
    // DELETE
    void delete(Long id);
}
