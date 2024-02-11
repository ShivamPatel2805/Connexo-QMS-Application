package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.example.database.entity.EntityMain;
import com.example.database.rootcauseanaylsis.RootCauseMainEnitiy;
import com.example.model.request.UserDTO;
import com.example.model.response.capa.create.CreateResponse;
import com.example.service.auth.AuthService;
import com.example.service.entity.RootCauseService;
import com.example.util.NetworkConstant;

import java.util.List;

@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/api/v1/rootcause")
public class RootCauseController {

    @Autowired
    private RootCauseService rootCauseService;

    @Autowired
    private AuthService authService;
    //http://localhost:8081/api/v1/rootcause/all
    @GetMapping("/all")
    public ResponseEntity<?> getAllRootEntityMains() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            List<RootCauseMainEnitiy> data = rootCauseService.getAllRootEntitiesByUserId(userData.getId());
            CreateResponse response = new CreateResponse<List<RootCauseMainEnitiy>>(true, NetworkConstant.TWO_HUNDRED, data);
            return ResponseEntity.ok(response.toString());
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }
    //http://localhost:8081/api/v1/rootcause/{id}

    @GetMapping("/{id}")
    public ResponseEntity<?> getRootEntityMainById(@PathVariable long id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            RootCauseMainEnitiy data1 = rootCauseService.getEntitiesByUserId(id, userData.getId());
            System.out.println(data1.toString());
            CreateResponse response = new CreateResponse<RootCauseMainEnitiy>(true, NetworkConstant.TWO_HUNDRED, data1);
            return ResponseEntity.ok(response.toString());
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }

    @PutMapping("/{id}")

    public RootCauseMainEnitiy updateRootCauseEntityMain(@PathVariable long id, @RequestBody RootCauseMainEnitiy rootCauseMainEnitiy) {
        return rootCauseService.updateRootEntityMain(id, rootCauseMainEnitiy);
    }

    //http://localhost:8081/api/v1/rootcause/createRootEntity
    @PostMapping("/createRootEntity")
    public ResponseEntity<?> rootEntity(@RequestBody RootCauseMainEnitiy rootCauseMainEnitiy) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            if (rootCauseMainEnitiy.getId() != null) {
                RootCauseMainEnitiy savedDataOfEntity = rootCauseService.getEntitiesByUserId(rootCauseMainEnitiy.getId(), userData.getId());
                if (savedDataOfEntity != null) {
                    if (savedDataOfEntity.getUserId() == null) {
                        savedDataOfEntity.setUserId(userData.getId());
                    }
                    savedDataOfEntity.setUpdateOnDate(System.currentTimeMillis());
                    RootCauseMainEnitiy updateData = rootCauseService.updateRootEntityMain(rootCauseMainEnitiy.getId(), rootCauseMainEnitiy);
                    CreateResponse response = new CreateResponse<RootCauseMainEnitiy>(true, NetworkConstant.TWO_HUNDRED, updateData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<RootCauseMainEnitiy>(true, NetworkConstant.FOUR_HUNDRED, "Data Not Found", null);
                    return ResponseEntity.badRequest().body(response.toString());
                }
            } else {
                rootCauseMainEnitiy.setUserId(userData.getId());
                rootCauseMainEnitiy.setStartDate(System.currentTimeMillis());
                RootCauseMainEnitiy createData = rootCauseService.saveRootCauseEntityMain(rootCauseMainEnitiy);
                if (createData != null) {
                    CreateResponse response = new CreateResponse<RootCauseMainEnitiy>(true, NetworkConstant.TWO_HUNDRED, createData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<RootCauseMainEnitiy>(true, NetworkConstant.FOUR_HUNDRED, "Data Not Saved", null);
                    return ResponseEntity.badRequest().body(response.toString());
                }

            }
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }
}