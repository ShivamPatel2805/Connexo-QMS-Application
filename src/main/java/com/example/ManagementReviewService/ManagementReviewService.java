package com.example.ManagementReviewService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExtentionEntity.Extention;
import com.example.ManagementReviewEntity.ManagementReview;
import com.example.ManagementReviewRepository.ManagementReviewRepo;

@Service
public class ManagementReviewService {
	
	@Autowired
	private ManagementReviewRepo managementReviewrepo;
	
	public ManagementReview SaveManagementReview(ManagementReview managementReview) {
        return managementReviewrepo.save(managementReview); // Use the inherited save method.
    }
    
    public List<ManagementReview> getAllEntities() {
        return managementReviewrepo.findAll();
    }

    public ManagementReview getManagementReviewById(long id) {
        return managementReviewrepo.findById(id).get();
    }
    
    public ManagementReview updateManagementReview(long id, ManagementReview managementReview) {
    	ManagementReview existingDeatils = managementReviewrepo.findById(id).get();
		existingDeatils.setManagementGenInfo(managementReview.getManagementGenInfo());
		existingDeatils.setOperationPlanning(managementReview.getOperationPlanning());
		existingDeatils.setMeetings(managementReview.getMeetings());
		return managementReviewrepo.save(existingDeatils);
		
	}
 

}
