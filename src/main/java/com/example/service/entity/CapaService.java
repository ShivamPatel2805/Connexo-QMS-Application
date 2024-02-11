package com.example.service.entity;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.CapaClosureRepo;
import com.example.Repository.CapaDetailsRepo;
import com.example.Repository.EntityMainRepo;
import com.example.database.capaEntity.CapaClosure;
import com.example.database.capaEntity.CapaDetails;
import com.example.database.entity.EntityMain;

import java.util.List;
import java.util.Optional;

@Service
public class CapaService {

@Autowired
private EntityMainRepo entityMainrepo;

@Autowired
private CapaDetailsRepo capaDetailsRepo;

@Autowired
private CapaClosureRepo capaClosureRepo;

    public EntityMain saveEntityMain(EntityMain entityMain) {
        return entityMainrepo.save(entityMain); // Use the inherited save method.
    }
    public EntityMain getEntityMainById(long id) {
        Optional<EntityMain> result = entityMainrepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    public List<EntityMain> getAllEntities() {
        return entityMainrepo.findAll();
    }

    public List<EntityMain> getAllEntitiesByUserId(Long userId) {
        return entityMainrepo.findAllByUserId(userId);
    }

    public EntityMain getEntitiesByUserId(Long id, Long userId) {
        return entityMainrepo.findEntityMainByIdAndUserId(id,userId);
    }

    public EntityMain updateEntityMain(long id, EntityMain entityMain) {
        Optional<EntityMain> existingDetails = entityMainrepo.findById(id);
        if (existingDetails.isPresent()) {
            return entityMainrepo.save(entityMain);
        } else {
            return null;
        }
    }

    public CapaDetails saveCapaDetails(CapaDetails capaDetails){

        return capaDetailsRepo.save(capaDetails);
    }

    public CapaClosure saveCapaClosure(CapaClosure capaClosure){

        return capaClosureRepo.save(capaClosure);
    }

    public List<CapaDetails> getAllCapaDetails(){

        return capaDetailsRepo.findAll();
    }

    public List<CapaClosure> getAllCapaClosure(){

        return capaClosureRepo.findAll();
    }


    public CapaDetails getCapaDetailsById(long id){
        Optional<CapaDetails> result1 = capaDetailsRepo.findById(id);
            if (result1.isPresent()){
                return result1.get();
            }
            else {
                throw new RuntimeException("CapaDetails not found for id: " + id);
            }

    }

    public CapaClosure getCapaClosureById(long id){
        Optional<CapaClosure> result2 = capaClosureRepo.findById(id);
            if(result2.isPresent()){
                return result2.get();
            }
            else {
                throw new RuntimeException("CapaClosure not found for id: " + id);
            }
    }


    public CapaDetails updateCapaDetails(long id,CapaDetails capaDetails ){
        Optional<CapaDetails> existDeatils = capaDetailsRepo.findById(id);
        if(existDeatils.isPresent()){
            return capaDetailsRepo.save(existDeatils.get());
        }else {
            throw new RuntimeException(" id not found for id: " +id);
        }
    }

    public CapaClosure updateCapaClosure(long id,CapaClosure capaClosure){
        Optional<CapaClosure> existClosure = capaClosureRepo.findById(id);
        if (existClosure.isPresent()){
            return capaClosureRepo.save(existClosure.get());
        }else {
            throw new RuntimeException("id not found for id: "+id);
        }
    }

    public void deleteEntityMain(long id) {
        Optional<EntityMain> existingDeatils = entityMainrepo.findById(id);
        if (existingDeatils.isPresent()) {
            entityMainrepo.delete(existingDeatils.get());
        } else {
            throw new RuntimeException("EntityMain not found for id: " + id);
        }
    }



}




