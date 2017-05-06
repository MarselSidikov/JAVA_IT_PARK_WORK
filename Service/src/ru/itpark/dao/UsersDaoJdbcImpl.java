package ru.itpark.dao;

import ru.itpark.models.User;

import java.sql.*;
import java.util.LinkedList;

public class UsersDaoJdbcImpl implements UsersDao {

    private Connection connection;

    //language=SQL
    private final String SQL_INSERT_USER =
            "INSERT INTO it_park_user(name, age) VALUES(?, ?)";

    public UsersDaoJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public int save(User model) {
        try {
            PreparedStatement statement = connection.prepareStatement(SQL_INSERT_USER, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, model.getName());
            statement.setInt(2, model.getAge());

            int insertedRowCount = statement.executeUpdate();
            if (insertedRowCount == 0) {
                throw new SQLException("Bad with insert");
            } else {
                ResultSet generatedKeysSet = statement.getGeneratedKeys();
                generatedKeysSet.next();
                return generatedKeysSet.getInt(1);
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public User find(int id) {
        return null;
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public LinkedList<User> findAll() {
        return null;
    }
}
