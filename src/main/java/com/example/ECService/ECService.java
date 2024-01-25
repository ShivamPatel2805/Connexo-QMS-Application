package com.example.ECService;


import com.example.ECEntity.ECmain;
import com.example.ECRepo.ECmainRepo;
import com.example.RCAEntity.RCAmain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ECService {
	
	
	@Autowired
	private ECmainRepo eCmainRepo;
	
	public ECmain SaveECmain(ECmain eCmain) {
        return eCmainRepo.save(eCmain); // Use the inherited save method.
    }
    
    public List<ECmain> getAllEntities() {
        return eCmainRepo.findAll();
    }

    public ECmain getEcMainById(long id) {
        return eCmainRepo.findById(id).get();
    }

    public ECmain updateECmain(long id, ECmain eCmain) {
        ECmain existingDeatils = eCmainRepo.findById(id).get();
        existingDeatils.setECGI(eCmain.getECGI());
        existingDeatils.setECResult(eCmain.getECResult());

        return eCmainRepo.save(existingDeatils);

    }
	

}
