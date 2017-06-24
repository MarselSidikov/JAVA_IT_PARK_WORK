package ru.itpark.controllers;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.dto.UserDto;
import ru.itpark.service.UsersService;
import ru.itpark.service.UsersServiceImpl;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return Lists.newArrayList(usersService.getUsers());
    }

    @GetMapping("/users/{user-id}")
    public UserDto getUser(@PathVariable("user-id") int userId) {
        return usersService.getUser(userId);
    }

    @GetMapping(value = "/users", params = "filter=age")
    public List<UserDto> getUsersByAge(@RequestParam("age") int age) {
        return usersService.getUsersByAge(age);
    }

    @PutMapping(value = "/users/{user-id}")
    public UserDto updatePassword(@PathVariable("user-id") int userId,
                                  @RequestHeader("new_password") String newPassword) {
        return usersService.updatePassword(userId, newPassword);
    }
}
