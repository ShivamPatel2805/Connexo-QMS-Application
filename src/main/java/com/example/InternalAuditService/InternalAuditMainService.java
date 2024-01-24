package com.example.InternalAuditService;

import com.example.InternalAuditEntity.EntityMain;
import com.example.InternalAuditRepository.InternalAuditMainRepo;
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
}
