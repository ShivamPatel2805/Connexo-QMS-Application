package com.example.InternalAuditService;

import com.example.InternalAuditEntity.EntityMain;
import com.example.InternalAuditRepository.InternalAuditMainRepo;
import com.example.RiskAssessmentEntity.RiskEntityMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternalAuditMainService {
    @Autowired
    private EntityMain entityMain;

    @Autowired
    private InternalAuditMainRepo internalAuditMainRepo;

    public EntityMain SaveEntityMain(EntityMain entityMain) {
        return internalAuditMainRepo.save(entityMain);
    }

    public List<EntityMain> getAllEntities() {
        return internalAuditMainRepo.findAll();
    }

    public EntityMain getEntityMain(long id) {
        return internalAuditMainRepo.findById(id).get();
    }

    public EntityMain updateInternalMain(long id, EntityMain entityMain) {
        EntityMain existingEntity = internalAuditMainRepo.findById(id).get();
        existingEntity.setAuditExecutions(entityMain.getAuditExecutions());
        existingEntity.setAuditPlannings(entityMain.getAuditPlannings());
        existingEntity.setAuditPreparations(entityMain.getAuditPreparations());
        existingEntity.setAuditRecords(entityMain.getAuditRecords());
        existingEntity.setAuditResponses(entityMain.getAuditResponses());
        return internalAuditMainRepo.save(existingEntity);
    }
}
