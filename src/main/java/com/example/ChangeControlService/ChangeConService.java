package com.example.ChangeControlService;

import com.example.ChangeControlEntity.ChangeControl;
import com.example.ChangeControlRepository.ChangeControlRepo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ChangeConService {

    @Autowired
    private ChangeControlRepo changeControlRepo;

    public ChangeControl SaveChangeControl(ChangeControl changeControl) {
        return changeControlRepo.save(changeControl); // Use the inherited save method.
    }
    
    public List<ChangeControl> getAllEntities() {
        return changeControlRepo.findAll();
    }

    public ChangeControl getChangeControlById(long id) {
        return changeControlRepo.findById(id).get();
    }

	public ChangeControl updateChangeControl(long id, ChangeControl changecontrol) {
		ChangeControl existingDeatils = changeControlRepo.findById(id).get();
		existingDeatils.setGeneralInfo(changecontrol.getGeneralInfo());
		existingDeatils.setChangedetails(changecontrol.getChangedetails());
		existingDeatils.setChaConQAReview(changecontrol.getChaConQAReview());
		existingDeatils.setEvalution(changecontrol.getEvalution());
		existingDeatils.setAdditionalInformation(changecontrol.getAdditionalInformation());
		existingDeatils.setGroupComments(changecontrol.getGroupComments());
		existingDeatils.setRiskAssessment(changecontrol.getRiskAssessment());
		existingDeatils.setQaApprovalComments(changecontrol.getQaApprovalComments());
		existingDeatils.setChangeClouser(changecontrol.getChangeClouser());
		return changeControlRepo.save(existingDeatils);
		
	}
 
}
