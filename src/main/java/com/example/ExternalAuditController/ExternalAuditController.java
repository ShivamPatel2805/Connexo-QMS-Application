package com.example.ExternalAuditController;

import com.example.ExternalAuditDtos.ExternalAuditRequest;
import com.example.ExternalAuditEntity.ExternalAuditMain;
import com.example.ExternalAuditRepo.ExternalAuditMainRepo;
import com.example.ExternalAuditService.ExternalAuditMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/externalAudit/api")
@CrossOrigin("http://localhost:5173")
public class ExternalAuditController {

    @Autowired
    private ExternalAuditMainRepo externalAuditMainRepo;

    @Autowired
    private ExternalAuditMainService externalAuditMainService;

    @PostMapping("/create")
    public ExternalAuditMain saveExternalAuditMain(@RequestBody ExternalAuditRequest externalAuditRequest){
        return externalAuditMainRepo.save(externalAuditRequest.getExternalAuditMain());
    }


    @GetMapping("/findAllDivision")
    public List<ExternalAuditMain> getAllEntities(){
        return externalAuditMainRepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public ExternalAuditMain getExternalAuditMainById(@PathVariable Long id) {
        return externalAuditMainService.getExternalAuditMainById(id);
    }



}
