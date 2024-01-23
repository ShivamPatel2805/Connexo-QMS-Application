package com.example.ExtentionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ExtentionEntity.Extention;
import com.example.ExtentionRepository.ExtentionRepo;

@Service
public class ExtentionService {
	
	@Autowired
	private ExtentionRepo extentionRepo;
	
	public Extention SaveExtention(Extention extention) {
        return extentionRepo.save(extention); // Use the inherited save method.
    }
    
    public List<Extention> getAllEntities() {
        return extentionRepo.findAll();
    }

    public Extention getExtentionById(long id) {
        return extentionRepo.findById(id).get();
    }
	

}
