package com.utosoftware.app.serviceImpls;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.User;
import com.utosoftware.app.repositories.UserRepository;
import com.utosoftware.app.services.UserService;
import com.utosoftware.app.types.UserDto;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.utosoftware.app.filters.LambdaFilter.string;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public Optional<User> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public MessengerVo save(User user) {
        System.out.println("서비스로 전달된 회원가입정보: "+user.toString());
        String result ="";
        if(repository.findByUsername(user.getUsername()).isEmpty() ){
            repository.save(User.builder()
                            .name(user.getName())
                            .username(user.getUsername())
                            .password(user.getPassword())
                            .email(user.getEmail())
                            .mobile(user.getMobile())
                            .regDate(user.getRegDate())
                            .build());
            result ="TRUE";
        }else{
            result = "FALSE";
        }
        return MessengerVo.builder().message(result).build();
    }

    @Override
    public MessengerVo count() {
        Long count = repository.count();
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message(string(count)).build();
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        List<User> list = repository.findAll(Sort.by(Sort.Direction.DESC,"name"));
        return list;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<User> findById(Long userid) {

        return repository.findById(userid);
    }


    @Override
    public MessengerVo delete(User user) {
        repository.delete(user);
        MessengerVo messenger = new MessengerVo();
        return messenger.builder().message("SUCCESS").build();
    }

    @Override
    public MessengerVo existsById(Long userid) {
        boolean  exist = repository.existsById(userid);
        MessengerVo messenger = new MessengerVo();
        if (exist){
            messenger.builder().message("TRUE").build();
        }else {
            messenger.builder().message("FALSE").build();
        }
        return messenger;
    }

    @Override
    public Optional<UserDto> login(UserDto user) {
        return null;
    }

    @Override
    public MessengerVo logout() {
        return MessengerVo.builder().build();
    }

    @Override
    public Optional<List<User>> findByName(String name) {

        return repository.findByName(name);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Optional<User> findByMobile(String mobile) {
        return repository.findByMobile(mobile);
    }


}
