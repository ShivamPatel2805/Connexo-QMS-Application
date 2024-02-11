package com.example.service.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.CapaGeneralInfoAttachRepo;
import com.example.Repository.CapaGeneralInfoRepo;
import com.example.database.capaEntity.CapaGenInfo;

import java.util.Optional;

@Service
public class GeneralInformationService {

    @Autowired
    private CapaGeneralInfoRepo capaGeneralInfoRepo;

    @Autowired
    private CapaGeneralInfoAttachRepo capaGeneralInfoAttachRepo;

    public CapaGenInfo updateCapaGenInfo(Long id, CapaGenInfo capaGenInfo) {
        Optional<CapaGenInfo> existDeatils = capaGeneralInfoRepo.findById(id);
        if(existDeatils.isPresent()){
            return capaGeneralInfoRepo.save(capaGenInfo);
        }else {
           return null;
        }
    }

    public CapaGenInfo saveCapaGenInfo(CapaGenInfo capaGenInfo) {
        return capaGeneralInfoRepo.save(capaGenInfo);
    }
}
