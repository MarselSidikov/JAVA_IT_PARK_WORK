package ru.itpark.service;

import ru.itpark.models.User;

public interface UsersService {
    boolean hasName(int userId, String name);
    void register(User user);
}
