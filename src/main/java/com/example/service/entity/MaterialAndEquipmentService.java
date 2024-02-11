package com.example.service.entity;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.MaterialAndEquipmentInfoRepo;
import com.example.database.capaEntity.CapaGenInfo;
import com.example.database.capaEntity.Material;
import com.example.database.capaEntity.MaterialAndEquipmentInfo;

import java.util.Optional;

@Service
public class MaterialAndEquipmentService {

    @Autowired
    private MaterialAndEquipmentInfoRepo repo;

    public MaterialAndEquipmentInfo getById(Long id){
        Optional<MaterialAndEquipmentInfo> existDeatils = repo.findById(id);
        return existDeatils.get();
    }

    public MaterialAndEquipmentInfo updateMaterialAndInfoData(Long id, MaterialAndEquipmentInfo data) {
        Optional<MaterialAndEquipmentInfo> existDeatils = repo.findById(id);
        if(existDeatils.isPresent()){
            return repo.save(data);
        }else {
           return null;
        }
    }

    public MaterialAndEquipmentInfo saveMaterial(MaterialAndEquipmentInfo data) {
        return repo.save(data);
    }
}
