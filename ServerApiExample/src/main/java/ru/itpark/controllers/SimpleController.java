package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itpark.models.User;
import ru.itpark.services.UsersService;

import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    private UsersService service;

    @GetMapping("/users")
    public List<User> getFriends(@RequestParam("age") int age) {
        return service.getUsersByAge(age);
    }

    @GetMapping(value = "users/{user-id}", params = "select=with_auto")
    public User getUserWithAuto(@PathVariable("user-id") int userId) {
        return service.getUserWithAuto(userId);
    }

}
