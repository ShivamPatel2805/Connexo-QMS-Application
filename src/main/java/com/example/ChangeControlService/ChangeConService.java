package com.example.ChangeControlService;

import com.example.ChangeControlEntity.ChangeControl;
import com.example.ChangeControlRepository.ChangeControlRepo;
import com.example.LabIncidentEntity.Labincident;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
