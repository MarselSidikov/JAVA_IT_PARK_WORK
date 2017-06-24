package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.dao.UsersDao;
import ru.itpark.dto.UserDto;
import ru.itpark.models.User;

import java.util.List;

import static ru.itpark.converters.Converter.convert;

@Service
public class UsersServiceImpl implements UsersService{


    @Autowired
    private UsersDao usersDao;

    public List<UserDto> getUsers() {
        List<User> users = usersDao.findAll();
        return convert(users);
    }

    @Override
    public UserDto getUser(int userId) {
        User user = usersDao.findOne(userId);
        return convert(user);
    }

    @Override
    public List<UserDto> getUsersByAge(int age) {
        List<User> users = usersDao.findByAge(age);
        return convert(users);
    }

    @Transactional
    @Override
    public UserDto updatePassword(int userId, String newPassword) {
        usersDao.updatePassword(userId, newPassword);
        User updatedPasswordUser = usersDao.findOne(userId);
        return convert(updatedPasswordUser);
    }
}
