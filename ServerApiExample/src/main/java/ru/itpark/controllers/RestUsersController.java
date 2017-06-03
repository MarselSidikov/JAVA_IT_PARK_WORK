package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.models.Auto;
import ru.itpark.models.User;
import ru.itpark.services.UsersService;

import java.util.List;

@RestController
public class RestUsersController {

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

    @PostMapping(value = "users/{user-id}/autos")
    public Integer addAutoToUser(@PathVariable("user-id") int userId,
                              @RequestBody Auto auto) {
        return service.addAutoToUser(userId, auto);
    }

}
