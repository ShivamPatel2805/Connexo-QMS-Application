package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.example.database.entity.EntityMain;
import com.example.model.request.UserDTO;
import com.example.model.response.capa.create.CreateResponse;
import com.example.service.auth.AuthService;
import com.example.service.entity.CapaService;
import com.example.util.NetworkConstant;

import java.util.List;

@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/api/v1/entity")
public class EntityMainController {

    @Autowired
    private CapaService capaService;

    @Autowired
    private AuthService authService;


    @GetMapping("/all")
    public ResponseEntity<?> getAllEntityMains() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            List<EntityMain> data = capaService.getAllEntitiesByUserId(userData.getId());
            System.out.println("data : "+ data.toString());
            if (data != null && data.size() > 0) {
                CreateResponse response = new CreateResponse<List<EntityMain>>(true, NetworkConstant.TWO_HUNDRED, data);
                return ResponseEntity.ok(response.toString());
            } else {
                CreateResponse response = new CreateResponse<List<EntityMain>>(true, NetworkConstant.TWO_HUNDRED, null);
                return ResponseEntity.ok(response.toString());
            }
        }else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEntityMainById(@PathVariable long id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            EntityMain data = capaService.getEntitiesByUserId(id,userData.getId());
            System.out.println(data.toString());
            if (data != null) {
                CreateResponse response = new CreateResponse<EntityMain>(true, NetworkConstant.TWO_HUNDRED, data);
                return ResponseEntity.ok(response.toString());
            } else {
                CreateResponse response = new CreateResponse<EntityMain>(true, NetworkConstant.TWO_HUNDRED, null);
                return ResponseEntity.ok(response.toString());
            }
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }

    //new
    @PostMapping("/createEntity")
    public ResponseEntity<?> entity(@RequestBody EntityMain mainEntity) {
        System.out.println("EntityData : " + mainEntity.toString() + "\n");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            if (mainEntity.getId() != null) {
                EntityMain savedDataOfEntity = capaService.getEntitiesByUserId(mainEntity.getId(), userData.getId());
                if (savedDataOfEntity != null) {
                    mainEntity.setCreateDate(savedDataOfEntity.getCreateDate());
                    mainEntity.setUserId(userData.getId());
                    mainEntity.setUpdateDate(System.currentTimeMillis());
                    EntityMain updateData = capaService.updateEntityMain(mainEntity.getId(), mainEntity);
                    CreateResponse response = new CreateResponse<EntityMain>(true, NetworkConstant.TWO_HUNDRED, "Capa Entity Updated Successfully ", updateData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<EntityMain>(true, NetworkConstant.FOUR_HUNDRED, "Data Not Found", null);
                    return ResponseEntity.badRequest().body(response.toString());
                }
            } else {
                mainEntity.setUserId(userData.getId());
                mainEntity.setCreateDate(System.currentTimeMillis());
                mainEntity.setUpdateDate(System.currentTimeMillis());
                EntityMain createData = capaService.saveEntityMain(mainEntity);
                if (createData != null) {
                    CreateResponse response = new CreateResponse<EntityMain>(true, NetworkConstant.TWO_HUNDRED, "Capa Entity Saved Successfully.", createData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<EntityMain>(true, NetworkConstant.FOUR_HUNDRED, "Data Not Saved", null);
                    return ResponseEntity.badRequest().body(response.toString());
                }

            }
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }
}




