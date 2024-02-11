package com.example.service.auth;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Repository.UserRepository;
import com.example.database.user.User;
import com.example.model.request.AuthRequest;
import com.example.model.request.UserDTO;
import com.example.service.Pair;

@Service
public class AuthServiceImple implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(AuthRequest signupReq) {
        User user = new User();
        user.setUsername(signupReq.getUsername());
        user.setEmail(signupReq.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(signupReq.getPassword()));
        User createdUser = userRepository.save(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(createdUser.getId());
        userDTO.setEmail(createdUser.getEmail());
        userDTO.setUsername(createdUser.getUsername());
        return userDTO;
    }

    public User getUser(String userName){

        return userRepository.findByUsername(userName);
    }

    @Override
    public User getUserByEmailAndUserName(String userName, String email) {
        return userRepository.findByUsernameAndEmail(userName, email);
    }

    @Override
    public Pair<Boolean, UserDTO> authenticateForLogin(String username, String password) {
        User user = new User();
        user.setUsername(username);
        User createdUserData = userRepository.findByUsername(username);
        if (createdUserData != null) {
            CharSequence encodedPassword = password;
            if (new BCryptPasswordEncoder().matches(encodedPassword, createdUserData.getPassword())) {
                User createdUser = createdUserData;
                UserDTO userDTO = new UserDTO();
                userDTO.setId(createdUser.getId());
                userDTO.setEmail(createdUser.getEmail());
                userDTO.setUsername(createdUser.getUsername());
                if (userDTO.getId() != null && createdUser.getEmail() != null && createdUser.getEmail().length() > 0) {
                    return new Pair<>(true, userDTO);
                } else {
                    return new Pair<>(false, new UserDTO());
                }
            } else {
                return new Pair<>(false, new UserDTO());
            }
        }
        return new Pair<>(false, new UserDTO());
    }
}

