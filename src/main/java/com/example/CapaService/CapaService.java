package com.example.CapaService;




import com.example.CapaEntity.EntityMain;

import com.example.CapaRepository.EntityMainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapaService {
    @Autowired
    private EntityMainRepo entityMainrepo;

    public EntityMain SaveEntityMain(EntityMain entityMain) {
        return entityMainrepo.save(entityMain); // Use the inherited save method.
    }

    public List<EntityMain> getAllEntities() {

        return entityMainrepo.findAll();
    }

    public EntityMain getEntityMainById(long id) {

        return entityMainrepo.findById(id).get();
    }


    public EntityMain updateEntityMain(long id, EntityMain entityMain) {
        EntityMain existingDeatils = entityMainrepo.findById(id).get();
        existingDeatils.setCapaClosure(entityMain.getCapaClosure());
        existingDeatils.setCapaGenInfo(entityMain.getCapaGenInfo());
        existingDeatils.setCapaProductInfo(entityMain.getCapaProductInfo());
        existingDeatils.setCapaMaterialInfo(entityMain.getCapaMaterialInfo());
        existingDeatils.setCapaEquipmentInfo(entityMain.getCapaEquipmentInfo());
        existingDeatils.setCapaExtensionJustificationInfo(entityMain.getCapaExtensionJustificationInfo());
        existingDeatils.setCapaEffectivenessCheckInfo(entityMain.getCapaEffectivenessCheckInfo());
        existingDeatils.setCapaAdditionalInfo(entityMain.getCapaAdditionalInfo());
        existingDeatils.setCapaGroupCommentInfo(entityMain.getCapaGroupCommentInfo());


        return entityMainrepo.save(existingDeatils);

    }

}
