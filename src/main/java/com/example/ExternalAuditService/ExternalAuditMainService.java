package com.example.ExternalAuditService;


import com.example.ExternalAuditEntity.ExternalAuditMain;
import com.example.ExternalAuditRepo.ExternalAuditMainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExternalAuditMainService {
    @Autowired
    private ExternalAuditMainRepo externalAuditMainRepo;

    public ExternalAuditMain SaveExternalAuditMain(ExternalAuditMain externalAuditMain) {
        return externalAuditMainRepo.save(externalAuditMain); // Use the inherited save method.
    }


    public List<ExternalAuditMain> getAllEntities() {

        return externalAuditMainRepo.findAll();
    }

    public ExternalAuditMain getExternalAuditMainById(Long id) {
        return externalAuditMainRepo.findById(id).get();
    }



}
