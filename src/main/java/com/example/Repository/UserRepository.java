package com.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.user.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	//User findFirstByEmail(String email);

    Optional<User> findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);

    User findByUsernameAndEmail(String username, String email);


}
