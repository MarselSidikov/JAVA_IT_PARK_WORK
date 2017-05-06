package ru.itpark.factory;

import ru.itpark.dao.UsersDao;
import ru.itpark.generators.IdGenerator;
import ru.itpark.service.UsersService;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AppComponentsFactory {

    private Properties properties;

    public AppComponentsFactory() {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("resources\\app.properties"));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public Object getComponent(String componentName) {
        try {
            switch (componentName) {
                case "usersService":
                    return getUsersService();
                case "usersDao":
                    return getUsersDao();
            }
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
        return null;
    }
    private UsersService getUsersService() throws ReflectiveOperationException, SQLException {
        String usersServiceClassName =
                properties.getProperty("users.service.class.name");
        Class<UsersService> usersServiceClass =
                (Class<UsersService>) Class.forName(usersServiceClassName);
        Constructor<UsersService> usersServiceConstructor =
                usersServiceClass.getConstructor(UsersDao.class);
        UsersService component =
                usersServiceConstructor.newInstance(getUsersDao());
        return component;
    }

    private UsersDao getUsersDao() throws ReflectiveOperationException, SQLException {
        String profile = properties.getProperty("dao.profile");
        if (profile.equals("file")) {
            String usersDaoClassName =
                    properties.getProperty("users.dao.file.class.name");
            String usersDaoFileName =
                    properties.getProperty("users.dao.file.name");
            Class<UsersDao> usersDaoClass =
                    (Class<UsersDao>) Class.forName(usersDaoClassName);
            Constructor<UsersDao> usersDaoConstructor =
                    usersDaoClass.getConstructor(String.class, IdGenerator.class);
            UsersDao component =
                    usersDaoConstructor.newInstance(usersDaoFileName, getIdGenerator());
            return component;
        } else if (profile.equals("db")) {
            String usersDaoClassName =
                    properties.getProperty("users.dao.jdbc.class.name");
            Class<UsersDao> usersDaoClass =
                    (Class<UsersDao>) Class.forName(usersDaoClassName);
            Constructor<UsersDao> usersDaoConstructor =
                    usersDaoClass.getConstructor(Connection.class);
            UsersDao component =
                    usersDaoConstructor.newInstance(getConnection());
            return component;
        } throw new IllegalArgumentException("Cannot resolve profile");
    }

    private IdGenerator getIdGenerator() throws ReflectiveOperationException {
        String idGeneratorClassName =
                properties.getProperty("id.generator.file.class.name");
        String idGeneratorFileName =
                properties.getProperty("id.generator.file.name");

        Class<IdGenerator> idGeneratorClass =
                (Class<IdGenerator>) Class.forName(idGeneratorClassName);

        Constructor<IdGenerator> idGeneratorConstructor =
                idGeneratorClass.getConstructor(String.class);

        IdGenerator component = idGeneratorConstructor.newInstance(idGeneratorFileName);
        return component;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(properties.getProperty("jdbc.url"),
                properties.getProperty("jdbc.name"),
                properties.getProperty("jdbc.password"));
    }
}
