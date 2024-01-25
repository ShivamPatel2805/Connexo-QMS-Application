package com.example.ManagementReviewController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExtentionEntity.Extention;
import com.example.ManagementReviewDtos.ManagementReviewRequest;
import com.example.ManagementReviewEntity.ManagementReview;
import com.example.ManagementReviewRepository.ManagementReviewRepo;
import com.example.ManagementReviewService.ManagementReviewService;

@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/managementreview/api")
public class ManagementReviewController {
	
	@Autowired
	private ManagementReviewRepo managementreviewrepo;
	
	
	@Autowired
	private ManagementReviewService managementReviewService;
	
	  @PostMapping("/create")
	    public ManagementReview createManagementReview(@RequestBody ManagementReviewRequest managementReviewRequest){
	        return managementreviewrepo.save(managementReviewRequest.getManagementReview());
	    }
	    
  
  @GetMapping("/findAllDivision")
  public List<ManagementReview> findAllDivision(){
      return managementreviewrepo.findAll();
  }

  @GetMapping("/GetBy/{id}")
  public ManagementReview getManagementReviewById(@PathVariable Long id) {
      return managementReviewService.getManagementReviewById(id);
  }
  
  @PutMapping("/update/{id}")
  public ManagementReview updateManagementReview(@PathVariable long id, @RequestBody ManagementReview managementReview) {
  	return managementReviewService.updateManagementReview(id, managementReview);
	   
  }


}
