package ru.itis.services;

import ru.itis.dao.UsersDao;
import ru.itis.models.User;

/**
 * 10.12.2018
 * UsersServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersServiceImpl implements UsersService {

    private UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public Long signIn(User user) {
        usersDao.save(user);
        return null;
    }
}
