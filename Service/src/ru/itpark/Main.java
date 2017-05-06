package ru.itpark;

import ru.itpark.dao.UsersDao;
import ru.itpark.dao.UsersDaoJdbcImpl;
import ru.itpark.factory.AppComponentsFactory;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        AppComponentsFactory factory = new AppComponentsFactory();
        UsersService usersService = (UsersService) factory.getComponent("usersService");
        User user = new User("MEGAMEN", 177);
        usersService.register(user);
    }
}
