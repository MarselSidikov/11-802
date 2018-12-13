package ru.itis;

import ru.itis.dao.UsersDao;
import ru.itis.models.User;
import ru.itis.dao.UsersDaoBufferedReaderImpl;
import ru.itis.sequences.IdGenerator;
import ru.itis.sequences.IdGeneratorImpl;
import ru.itis.services.UsersService;
import ru.itis.services.UsersServiceImpl;

public class Main {

    public static void main(String[] args) {
        IdGenerator generator = IdGeneratorImpl.generator();
        UsersDao usersDao = new UsersDaoBufferedReaderImpl("users.txt", generator);
        UsersService usersService = new UsersServiceImpl(usersDao);
        User user = new User("Вероника", "Соцкова");
        User user1 = new User("Аделя", "Гариева");
        User user2 = new User("Камилла", "Хайруллина");
        usersService.signIn(user);
        usersService.signIn(user1);
        usersService.signIn(user2);

    }
}
