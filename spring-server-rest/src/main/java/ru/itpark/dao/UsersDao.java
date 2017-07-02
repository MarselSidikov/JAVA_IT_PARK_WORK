package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.models.User;

import java.lang.annotation.Native;
import java.util.List;

public interface UsersDao extends JpaRepository<User, Integer> {

    List<User> findByAge(int age);

    @Modifying
    @Query("update User user set user.passwordHash = ?2 where user.id = ?1")
    void updatePassword(int userId, String password);

    @Query("select count(user) > 0 from User user where user.token = ?1")
    boolean isExistToken(String token);

    User findByToken(String token);

    User findByLogin(String login);

    @Modifying
    @Query("update User user set user.token = ?2 where user.id = ?1")
    void updateToken(int id, String token);
}
