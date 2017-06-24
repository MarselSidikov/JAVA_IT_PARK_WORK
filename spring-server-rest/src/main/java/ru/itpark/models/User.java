package ru.itpark.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "itpark_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private int age;

    @Column
    private String name;

    @Column
    private String token;

    public User() {
    }

    public User(String login, String password, int age, String name, String token) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.name = name;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id &&
                age == user.age &&
                Objects.equal(login, user.login) &&
                Objects.equal(password, user.password) &&
                Objects.equal(name, user.name) &&
                Objects.equal(token, user.token);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, login, password, age, name, token);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("login", login)
                .add("password", password)
                .add("age", age)
                .add("name", name)
                .add("token", token)
                .toString();
    }
}
