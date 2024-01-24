package com.example.ManagementReviewService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
