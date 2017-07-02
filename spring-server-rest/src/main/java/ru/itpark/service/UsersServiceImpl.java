package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.dao.UsersDao;
import ru.itpark.dto.UserDataForRegistrationDto;
import ru.itpark.dto.UserDto;
import ru.itpark.models.User;
import ru.itpark.security.utils.TokenGenerator;

import java.util.List;

import static ru.itpark.converters.Converter.convert;

@Service
public class UsersServiceImpl implements UsersService{


    @Autowired
    private UsersDao usersDao;

    @Autowired
    private TokenGenerator generator;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();

    public List<UserDto> getUsers() {
        List<User> users = usersDao.findAll();
        return convert(users);
    }

    @Override
    public UserDto getUser(int userId) {
        User user = usersDao.findOne(userId);
        return convert(user);
    }

    @Override
    public List<UserDto> getUsersByAge(int age) {
        List<User> users = usersDao.findByAge(age);
        return convert(users);
    }

    @Transactional
    @Override
    public UserDto updatePassword(int userId, String newPassword) {
        usersDao.updatePassword(userId, newPassword);
        User updatedPasswordUser = usersDao.findOne(userId);
        return convert(updatedPasswordUser);
    }

    @Override
    public UserDto registerUser(UserDataForRegistrationDto registrationData) {
        User user = new User(
                registrationData.getLogin(),
                encoder.encode(registrationData.getPassword()),
                registrationData.getAge(),
                registrationData.getName()
        );

        User savedUser = usersDao.save(user);

        return convert(savedUser);
    }

    @Transactional
    @Override
    public String login(String login, String password) {
        User registeredUser = usersDao.findByLogin(login);

        if (registeredUser != null) {
            if (encoder.matches(password, registeredUser.getPasswordHash())) {
                String token = generator.generate();
                usersDao.updateToken(registeredUser.getId(), token);
                return token;
            }
        }
        throw new IllegalArgumentException("Incorrect username or password");
    }
}
