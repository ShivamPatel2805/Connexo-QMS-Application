package com.example.RCAController;

import com.example.ExternalAuditDtos.ExternalAuditRequest;
import com.example.ExternalAuditEntity.ExternalAuditMain;
import com.example.ExternalAuditRepo.ExternalAuditMainRepo;
import com.example.ExternalAuditService.ExternalAuditMainService;
import com.example.RCADtos.RCARequest;
import com.example.RCAEntity.RCAmain;
import com.example.RCARepo.RCAmainRepo;
import com.example.RCAService.RCAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/RCA/api")
@CrossOrigin("http://localhost:5173")
public class RCAController {

    @Autowired
    private RCAmainRepo rcAmainRepo;

    @Autowired
    private RCAService rcaService;

    @PostMapping("/create")
    public RCAmain saveExternalAuditMain(@RequestBody RCARequest rcaRequest){
        return rcAmainRepo.save(rcaRequest.getRcAmain());
    }


    @GetMapping("/findAllDivision")
    public List<RCAmain> getAllEntities(){
        return rcAmainRepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public RCAmain getExternalAuditMainById(@PathVariable Long id) {
        return rcaService.getRCAMainById(id);
    }



}
