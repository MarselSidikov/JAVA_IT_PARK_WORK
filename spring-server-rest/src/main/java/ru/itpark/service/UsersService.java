package ru.itpark.service;


import ru.itpark.dto.UserDataForRegistrationDto;
import ru.itpark.dto.UserDto;

import java.util.List;

public interface UsersService {
    List<UserDto> getUsers();

    UserDto getUser(int userId);

    List<UserDto> getUsersByAge(int age);

    UserDto updatePassword(int userId, String newPassword);

    UserDto registerUser(UserDataForRegistrationDto registrationData);

    String login(String login, String password);
}
