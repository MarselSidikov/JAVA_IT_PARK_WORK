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
    @Query("update User user set user.password = ?2 where user.id = ?1")
    void updatePassword(int userId, String password);
}
