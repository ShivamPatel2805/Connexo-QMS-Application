package com.example.InternalAuditService;

import com.example.InternalAuditEntity.InternalEntityMain;
import com.example.InternalAuditRepository.InternalAuditMainRepo;
import com.example.RiskAssessmentEntity.RiskEntityMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternalAuditMainService {
    @Autowired
    private InternalEntityMain entityMain;

    @Autowired
    private InternalAuditMainRepo internalAuditMainRepo;

    public InternalEntityMain SaveEntityMain(InternalEntityMain entityMain) {
        return internalAuditMainRepo.save(entityMain);
    }

    public List<InternalEntityMain> getAllEntities() {
        return internalAuditMainRepo.findAll();
    }

    public InternalEntityMain getEntityMain(long id) {
        return internalAuditMainRepo.findById(id).get();
    }

    public InternalEntityMain updateInternalMain(long id, InternalEntityMain entityMain) {
        InternalEntityMain existingEntity = internalAuditMainRepo.findById(id).get();
        existingEntity.setAuditExecutions(entityMain.getAuditExecutions());
        existingEntity.setAuditPlannings(entityMain.getAuditPlannings());
        existingEntity.setAuditPreparations(entityMain.getAuditPreparations());
        existingEntity.setAuditRecords(entityMain.getAuditRecords());
        existingEntity.setAuditResponses(entityMain.getAuditResponses());
        return internalAuditMainRepo.save(existingEntity);
    }
}
