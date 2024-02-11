package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.capaEntity.CapaGenInfo;
import com.example.model.request.UserDTO;
import com.example.model.response.capa.create.CreateResponse;
import com.example.service.entity.CapaService;
import com.example.service.entity.GeneralInformationService;
import com.example.service.entity.GroupCommentService;
import com.example.service.entity.MaterialAndEquipmentService;
import com.example.util.NetworkConstant;

@RestController
@RequestMapping("/api/v1/capa/")
public class CapaCrudController {

    @Autowired
    private CapaService capaService;

    @Autowired
    private GeneralInformationService generalInformationService;

    @Autowired
    private MaterialAndEquipmentService materialAndEquipmentService;

    @Autowired
    private GroupCommentService groupCommentService;

    // Capa GeneralInformation
    @PostMapping("generalInformation")
    public ResponseEntity<?> createGeneralInformation(@RequestBody CapaGenInfo capaGenInfo) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDTO userData = (UserDTO) authentication.getPrincipal();
        if (userData != null) {
            System.out.println(capaGenInfo.toString());
            if (capaGenInfo.getId() != null) {
                CapaGenInfo updatedData = generalInformationService.updateCapaGenInfo(capaGenInfo.getId(), capaGenInfo);
                if (updatedData != null) {
                    CreateResponse response = new CreateResponse<CapaGenInfo>(true, NetworkConstant.TWO_HUNDRED, updatedData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<CapaGenInfo>(true, NetworkConstant.FOUR_HUNDRED_SEVENTEEN, updatedData);
                    return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response.toString());
                }
            } else {
                CapaGenInfo createdData = generalInformationService.saveCapaGenInfo(capaGenInfo);
                if (createdData != null) {
                    CreateResponse response = new CreateResponse<CapaGenInfo>(true, NetworkConstant.TWO_HUNDRED, createdData);
                    return ResponseEntity.ok(response.toString());
                } else {
                    CreateResponse response = new CreateResponse<CapaGenInfo>(true, NetworkConstant.FOUR_HUNDRED_SEVENTEEN, createdData);
                    return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(response.toString());
                }
            }
        } else {
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.FOUR_HUNDRED_ONE, "UnAuthorize User");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response.toString());
        }
    }


}
