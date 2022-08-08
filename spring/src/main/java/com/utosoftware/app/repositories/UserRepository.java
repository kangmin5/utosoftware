package com.utosoftware.app.repositories;

import com.utosoftware.app.components.MessengerVo;
import com.utosoftware.app.entities.User;
import com.utosoftware.app.types.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Optional<List<User>> findByName(String name);
    Optional<User> findByEmail(String email);
    Optional<User> findByMobile(String mobile);


}
