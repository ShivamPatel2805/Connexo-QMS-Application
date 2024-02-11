package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.example.database.recordWorkflow.RecordWorkFlow;
import com.example.model.request.UserDTO;
import com.example.model.response.capa.create.CreateResponse;
import com.example.service.recordWorkflow.RecordWorkFlowService;
import com.example.util.NetworkConstant;

@RestController
@RequestMapping("/api/v1/recordFlow")
public class RecordFlowCrudController {

    @Autowired
    private RecordWorkFlowService service;

    // Capa GeneralInformation
    //api calling for createRecord
    @PostMapping("/createRecordFlow")
    public ResponseEntity<?> createWork(@RequestBody RecordWorkFlow info) {
        // token verification
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            info.setUserId(userData.getId());
            System.out.println(info.toString());
            if (info.getId() != null) {
                RecordWorkFlow updatedData = service.updateRecordFlow(info.getId(), info);
                if (updatedData != null) {
                    CreateResponse response = new CreateResponse<RecordWorkFlow>(true, NetworkConstant.TWO_HUNDRED, updatedData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<RecordWorkFlow>(true, NetworkConstant.FOUR_HUNDRED_SEVENTEEN, updatedData);
                    return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response.toString());
                }
            } else {
                RecordWorkFlow createdData = service.saveMaterial(info);
                if (createdData != null) {
                    CreateResponse response = new CreateResponse<RecordWorkFlow>(true, NetworkConstant.TWO_HUNDRED, createdData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<RecordWorkFlow>(true, NetworkConstant.FOUR_HUNDRED_SEVENTEEN, createdData);
                    return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response.toString());
                }
            }
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRecordFlow(@PathVariable long id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            RecordWorkFlow data = service.getByIdwithCurrentUser(id, userData.getId());
            System.out.println(data.toString());
            CreateResponse response = new CreateResponse<RecordWorkFlow>(true, NetworkConstant.TWO_HUNDRED, data);
            return ResponseEntity.ok(response.toString());
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }
}
