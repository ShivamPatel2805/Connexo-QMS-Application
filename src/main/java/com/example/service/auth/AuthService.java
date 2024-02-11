package com.example.service.auth;

import com.example.database.user.User;
import com.example.model.request.AuthRequest;
import com.example.model.request.UserDTO;
import com.example.service.Pair;

public interface AuthService {
    UserDTO createUser(AuthRequest signupReq);
    Pair<Boolean,UserDTO> authenticateForLogin(String username, String password);

    User getUser(String userName);

    User getUserByEmailAndUserName(String userName, String email);
}
