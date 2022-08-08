package com.utosoftware.app.services;


import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.User;
import com.utosoftware.app.types.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UserService {
    MessengerVo save(User user);
    MessengerVo count();
    List<User> findAll();
    List<User> findAll(Sort sort);
    Page<User> findAll(Pageable pageable);
    Optional<User> findById(Long userid);
    Optional<User> findByUsername(String username);
    MessengerVo delete(User user);
    MessengerVo existsById(Long userid);

    Optional<UserDto> login(UserDto user);
    MessengerVo logout();

    Optional<List<User>> findByName(String name);
    Optional<User> findByEmail(String email);
    Optional<User> findByMobile(String mobile);
}
