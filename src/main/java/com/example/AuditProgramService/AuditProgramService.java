package com.example.AuditProgramService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ActionItemEntity.ActionItem;
import com.example.AuditProgramEntity.AuditProgram;
import com.example.AuditProgramRepository.AuditProgramRepo;


@Service
public class AuditProgramService {
	
	
	@Autowired
	private AuditProgramRepo auditProgramRepo;
	
	public AuditProgram SaveAuditProgram(AuditProgram auditProgram) {
        return auditProgramRepo.save(auditProgram); // Use the inherited save method.
    }
    
    public List<AuditProgram> getAllEntities() {
        return auditProgramRepo.findAll();
    }

    public AuditProgram getAuditProgramById(long id) {
        return auditProgramRepo.findById(id).get();
    }
	
    public AuditProgram updateAuditProgram(long id, AuditProgram auditprogram) {
    	AuditProgram existingDeatils = auditProgramRepo.findById(id).get();
		existingDeatils.setAuditGeneralInfo(auditprogram.getAuditGeneralInfo());
		return auditProgramRepo.save(existingDeatils);
		
	}


}
