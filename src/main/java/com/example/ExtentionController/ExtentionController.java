package com.example.ExtentionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AuditProgramEntity.AuditProgram;
import com.example.ExtentionDtos.ExtentionRequest;
import com.example.ExtentionEntity.Extention;
import com.example.ExtentionRepository.ExtentionRepo;
import com.example.ExtentionService.ExtentionService;



@RestController
@RequestMapping("/extention/api")
public class ExtentionController {
	
	 @Autowired
	    private ExtentionRepo extentionRepo;
	    
	    @Autowired
	    private ExtentionService extentionService;
	    
	    @PostMapping("/create")
	    public Extention createExtention(@RequestBody ExtentionRequest extentionRequest){
	        return extentionRepo.save(extentionRequest.getExtention());
	    }
	    
	    @GetMapping("/findAllDivision")
	    public List<Extention> findAllDivision(){
	        return extentionRepo.findAll();
	    }

	    @GetMapping("/GetBy/{id}")
	    public Extention getExtentionById(@PathVariable Long id) {
	        return extentionService.getExtentionById(id);
	    }
	    
	    @PutMapping("/update/{id}")
        public Extention updateExtention(@PathVariable long id, @RequestBody Extention extention) {
        	return extentionService.updateExtention(id, extention);
     	   
        }

}
