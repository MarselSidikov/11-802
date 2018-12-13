package ru.itis.services;

import ru.itis.models.User;
/**
 * 10.12.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    Long signIn(User user);
}
