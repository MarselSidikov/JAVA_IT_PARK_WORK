package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itpark.dao.AutosDao;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.Auto;
import ru.itpark.models.User;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Autowired
    private AutosDao autosDao;

    @Override
    public List<User> getUsersByAge(int age) {
        return usersDao.findAllByAge(age);
    }

    @Override
    public User getUserWithAuto(int userId) {
        return usersDao.findByIdWithAutos(userId);
    }

    @Override
    public int addAutoToUser(int userId, Auto auto) {
        return autosDao.saveForUser(userId, auto);
    }
}
