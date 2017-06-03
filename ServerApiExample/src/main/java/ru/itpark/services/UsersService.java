package ru.itpark.services;

import ru.itpark.models.Auto;
import ru.itpark.models.User;

import java.util.List;

public interface UsersService {
    List<User> getUsersByAge(int age);

    User getUserWithAuto(int userId);
    int addAutoToUser(int userId, Auto auto);
}
