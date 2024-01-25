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

    public RCAmain updateRCAmain(long id, RCAmain rcAmain) {
        RCAmain existingDeatils = rcAmainRepo.findById(id).get();
        existingDeatils.setRCAInvestigation(rcAmain.getRCAInvestigation());
        existingDeatils.setRCAGroupComments(rcAmain.getRCAGroupComments());
        existingDeatils.setRCARootCause(rcAmain.getRCARootCause());
        return rcAmainRepo.save(existingDeatils);

    }

}
