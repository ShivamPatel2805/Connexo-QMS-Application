package com.example.RCAService;


import com.example.ExternalAuditEntity.ExternalAuditMain;
import com.example.ExternalAuditRepo.ExternalAuditMainRepo;
import com.example.RCAEntity.RCAmain;
import com.example.RCARepo.RCAmainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RCAService {
    @Autowired
    private RCAmainRepo rcAmainRepo;

    public RCAmain SaveExternalAuditMain(RCAmain rcAmain) {
        return rcAmainRepo.save(rcAmain); // Use the inherited save method.
    }


    public List<RCAmain> getAllEntities() {

        return rcAmainRepo.findAll();
    }

    public RCAmain getRCAMainById(Long id) {
        return rcAmainRepo.findById(id).get();
    }



}
