package com.utosoftware.app.controllers;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.User;
import com.utosoftware.app.services.UserService;
import com.utosoftware.app.types.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @GetMapping("/save") public MessengerVo save(User user) {
        return userService.save(user);
    }

    @GetMapping("/count") public MessengerVo count() {
        return userService.count();
    }

    @GetMapping("/findAll") public List<User> findAll() {

        return userService.findAll();
    }

    @GetMapping("/findById") public Optional<User> findById(Long userid) {
        return userService.findById(userid);
    }

    @GetMapping("/findByUsername") public Optional<User> findByUsername(String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/delete") public MessengerVo delete(User user) {
        return userService.delete(user);
    }

    @GetMapping("/existsById") public MessengerVo existsById(Long userid) {
        return userService.existsById(userid);
    }

    @GetMapping("/login") public Optional<UserDto> login(UserDto user) {
        return userService.login(user);
    }

    @GetMapping("/logout") public MessengerVo logout() {
        return userService.logout();
    }

    @GetMapping("/findByName") public Optional<List<User>> findByName(String name) {
        return userService.findByName(name);
    }

    @GetMapping("/findByEmail") public Optional<User> findByEmail(String email) {
        return userService.findByEmail(email);
    }

    @GetMapping("/findByMobile") public Optional<User> findByMobile(String mobile) {
        return userService.findByMobile(mobile);
    }
}
