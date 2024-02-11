package com.example.Controller;

import static com.example.util.NetworkConstant.TWO_HUNDRED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.user.User;
import com.example.model.request.AuthRequest;
import com.example.model.request.UserDTO;
import com.example.model.response.auth.LoginData;
import com.example.model.response.auth.LoginResponse;
import com.example.model.response.capa.create.CreateResponse;
import com.example.service.Pair;
import com.example.service.auth.AuthService;
import com.example.util.JwtUtil;
import com.example.util.NetworkConstant;

@RestController

public class AuthenticationController {
    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody AuthRequest singnRequest) {
        User isUserExist = authService.getUserByEmailAndUserName(singnRequest.getUsername(), singnRequest.getEmail());
        if (isUserExist != null) {
            CreateResponse response = new CreateResponse<User>(true, NetworkConstant.FOUR_HUNDRED, "Account already exist", null);
            return ResponseEntity.badRequest().body(response.toString());
        } else {
            if (singnRequest.getEmail() == null || singnRequest.getEmail().isEmpty()) {
                CreateResponse response = new CreateResponse<User>(true, NetworkConstant.FOUR_HUNDRED, "Please Enter Email", null);
                return ResponseEntity.badRequest().body(response.toString());
            } else if (singnRequest.getUsername() == null || singnRequest.getUsername().isEmpty()) {
                CreateResponse response = new CreateResponse<User>(true, NetworkConstant.FOUR_HUNDRED, "Please Enter Name", null);
                return ResponseEntity.badRequest().body(response.toString());
            } else if (singnRequest.getPassword() == null || singnRequest.getPassword().isEmpty()) {
                CreateResponse response = new CreateResponse<User>(true, NetworkConstant.FOUR_HUNDRED, "Password is required.", null);
                return ResponseEntity.badRequest().body(response.toString());
            } else {
                UserDTO createdUser = authService.createUser(singnRequest);
                if (createdUser == null) {
                    CreateResponse response = new CreateResponse<User>(true, NetworkConstant.FOUR_HUNDRED, "Account Not Created,Please Try Again later.", null);
                    return ResponseEntity.badRequest().body(response.toString());
                } else {
                    createdUser.setPassword("****************");
                    CreateResponse response = new CreateResponse<UserDTO>(true, TWO_HUNDRED, "Account Created Successfully.", createdUser);
                    return ResponseEntity.ok().body(response.toString());
                }
            }
        }
    }


    @PostMapping("/authenticate")
    public ResponseEntity<?> login(@RequestBody AuthRequest loginReq) {
        String username = loginReq.getUsername();
        String password = loginReq.getPassword();
        String email = loginReq.getEmail();
        // Validate user credentials

        Pair<Boolean,UserDTO> data = authService.authenticateForLogin(username, password);
        if (data.first) {
            String token = jwtUtil.generateToken(data.second );
            LoginData loginData = new LoginData(token,String.valueOf(jwtUtil.getExpiration()),data.second.getUsername(),data.second.getEmail());
            LoginResponse response = new LoginResponse( true , TWO_HUNDRED, loginData);
            return ResponseEntity.ok(response.toString());
        } else {
            LoginResponse response = new LoginResponse( false , NetworkConstant.FOUR_HUNDRED_ONE, null);
            return ResponseEntity.ok(response.toString());
           // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }



}
