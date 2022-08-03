package com.utosoftware.app.serviceImpls;


import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.User;
import com.utosoftware.app.repositories.UserRepository;
import com.utosoftware.app.services.UserService;
import com.utosoftware.app.types.UserDto;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;


    @Override
    public MessengerVo save(User user) {
        return null;
    }

    @Override
    public MessengerVo count() {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(UserDto userDto) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public MessengerVo delete(User user) {
        return null;
    }

    @Override
    public MessengerVo existsById(String userid) {
        return null;
    }

    @Override
    public UserDto login(UserDto user) {
        return null;
    }

    @Override
    public MessengerVo logout() {
        return null;
    }
}
