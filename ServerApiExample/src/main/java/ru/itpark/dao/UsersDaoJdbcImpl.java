package ru.itpark.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import ru.itpark.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UsersDaoJdbcImpl implements UsersDao {

    //language=SQL
    private final String SQL_INSERT_USER =
            "INSERT INTO it_park_user(name, age) VALUES(:name, :age)";

    //language=SQL
    private final String SQL_SELECT_USER_BY_ID =
            "SELECT * FROM it_park_user WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM it_park_user";

    //language=SQL
    private final String SQL_DELETE_USER_BY_ID =
            "DELETE FROM it_park_user WHERE id = :id";

    //language=SQL
    private final String SQL_USER_UPDATE_BY_ID =
            "UPDATE it_park_user SET name = :name, age = :age WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_USERS_BY_AGE =
            "SELECT * FROM it_park_user WHERE age = :age";

    private NamedParameterJdbcTemplate template;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public UsersDaoJdbcImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

    public int save(User model) {
        // собрали значения именнованных параметров
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", model.getName());
        params.addValue("age", model.getAge());

        String interestingKeys[] = {"id"};

        // держатель сгенерированного ключа вставленной строки
        KeyHolder holder = new GeneratedKeyHolder();
        template.update(SQL_INSERT_USER, params, holder, interestingKeys);
        Number generatedId = holder.getKey();
        return generatedId.intValue();
    }

    // анонимный класс
    // реализуем интерфейс "на месте"
    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            return new User(id, name, age);
        }
    };

    public User find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_USER_BY_ID, params, userRowMapper);
    }

    public void update(User model) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", model.getId());
        params.put("name", model.getName());
        params.put("age", model.getAge());
        template.update(SQL_USER_UPDATE_BY_ID, params);
    }

    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_USER_BY_ID, params);
    }

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public List<User> findAllByAge(int age) {
        Map<String, Object> params = new HashMap<>();
        params.put("age", age);
        return template.query(SQL_SELECT_USERS_BY_AGE, params, userRowMapper);
    }

    @Override
    public User findByIdWithAutos(int id) {
        Session session = getSession();
        session.beginTransaction();

        User user =
                session.createQuery("from User user where user.id = :id", User.class)
                        .setParameter("id", id).getSingleResult();
        session.getTransaction().commit();
        return user;
    }

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;
    }
}
