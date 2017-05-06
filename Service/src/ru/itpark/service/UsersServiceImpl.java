package ru.itpark.service;


import ru.itpark.dao.UsersDao;
import ru.itpark.models.User;

public class UsersServiceImpl implements UsersService {

    private UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public boolean hasName(int userId, String name) {
        User user = usersDao.find(userId);
        return user.getName().equals(name);
    }

    @Override
    public void register(User user) {
        usersDao.save(user);
    }
}
