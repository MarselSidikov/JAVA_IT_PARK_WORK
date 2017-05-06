package ru.itpark;

import java.sql.*;
import java.util.Scanner;

public class Main {
    //language=SQL
    private static final String SELECT_ALL_USERS =
            "SELECT * FROM it_park_user";

    //language=SQL
    private static final String SQL_GET_COUNT_OF_AUTOS_BY_NAME =
            "SELECT COUNT(*)" +
                    " FROM auto a WHERE a.owner_id =" +
                    " (SELECT (id) FROM it_park_user u" +
                    " WHERE u.name = ?)";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/itpark_group",
                            "postgres",
                            "Zaq12wsx");

            Statement selectStatement
                    = connection.createStatement();

            ResultSet resultSet =
                    selectStatement.executeQuery(SELECT_ALL_USERS);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getInt("age"));
            }

            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            /*
             Statement countStatement = connection.createStatement();

            ResultSet countResultSet =
                    countStatement.executeQuery("SELECT COUNT(*)" +
                            "FROM auto a WHERE a.owner_id =" +
                            "(SELECT (id) FROM it_park_user u" +
                            "WHERE u.name ='" + name + "')");
            */

            PreparedStatement countStatement =
                    connection.prepareStatement(SQL_GET_COUNT_OF_AUTOS_BY_NAME);
            countStatement.setString(1, name);
            ResultSet countResultSet = countStatement.executeQuery();
            countResultSet.next();
            int count = countResultSet.getInt("count");
            System.out.println(count);

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
