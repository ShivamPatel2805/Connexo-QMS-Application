package com.example.InternalAuditController;


import com.example.InternalAuditService.InternalAuditMainService;
import com.example.InternalAuditDtos.InternalAudDtos;
import com.example.InternalAuditEntity.InternalEntityMain;
import com.example.InternalAuditRepository.InternalAuditMainRepo;
import com.example.RiskAssessmentEntity.RiskEntityMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/internalaudit/api")
@CrossOrigin("http://localhost:5173")
public class InternalAudController {

    @Autowired
    private InternalAuditMainService internalAuditMainService;

    @Autowired
    private InternalAuditMainRepo internalAuditMainRepo;

    @PostMapping("/create")
    public InternalEntityMain createExtention(@RequestBody InternalAudDtos internalAudDtos) {
        return internalAuditMainRepo.save(internalAudDtos.getEntityMain());
    }

    @GetMapping("/findAll")
    public List<InternalEntityMain> findAllDivision() {
        return internalAuditMainRepo.findAll();
    }

    @GetMapping("/GetBy/{id}")
    public InternalEntityMain getActionItemById(@PathVariable Long id) {
        return internalAuditMainService.getEntityMain(id);
    }

    @PutMapping("/update/{id}")
    public InternalEntityMain updateInternalMain(@PathVariable long id, @RequestBody InternalEntityMain entityMain) {
        return internalAuditMainService.updateInternalMain(id, entityMain);
    }
}
