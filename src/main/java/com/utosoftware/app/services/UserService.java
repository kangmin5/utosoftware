package com.utosoftware.app.services;


import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.User;
import com.utosoftware.app.types.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    MessengerVo save(User user);
    MessengerVo count();
    List<User> findAll();
    Optional<User> findById(UserDto userDto);
    Optional<User> findByUsername(String username);
    MessengerVo delete(User user);
    MessengerVo existsById(String userid);
    UserDto login(UserDto user);
    MessengerVo logout();
}
