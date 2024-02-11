package com.example.service.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.rootcauseanaylsis.RootCauseMainEnitiyRepo;
import com.example.Repository.rootcauseanaylsis.RootGenInfoRepo;
import com.example.database.entity.EntityMain;
import com.example.database.rootcauseanaylsis.RootCauseMainEnitiy;
import com.example.database.rootcauseanaylsis.RootGenInfo;
import com.example.database.rootcauseanaylsis.RootGeneralInfoAttach;

import java.util.List;
import java.util.Optional;

@Service
public class RootCauseService {

    @Autowired
    private RootCauseMainEnitiyRepo rootCauseMainEnitiyRepo;




    public RootCauseMainEnitiy saveRootCauseEntityMain(RootCauseMainEnitiy rootCauseMainEnitiy) {
        return rootCauseMainEnitiyRepo.save(rootCauseMainEnitiy); // Use the inherited save method.
    }

    public RootCauseMainEnitiy getRootEntityMainById(long id) {
        Optional<RootCauseMainEnitiy> result = rootCauseMainEnitiyRepo.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("EntityMain not found for id: " + id);
        }
    }

    public List<RootCauseMainEnitiy> getAllRootEntities() {
        return rootCauseMainEnitiyRepo.findAll();
    }

    public List<RootCauseMainEnitiy> getAllRootEntitiesByUserId(Long userId) {
        return rootCauseMainEnitiyRepo.findAllRootByUserId(userId);
    }

    public RootCauseMainEnitiy getEntitiesByUserId(Long id, Long userId) {
        return rootCauseMainEnitiyRepo.findRootEntityMainByIdAndUserId(id, userId);
    }

    public RootCauseMainEnitiy updateRootEntityMain(long id, RootCauseMainEnitiy rootCauseMainEnitiy) {
        Optional<RootCauseMainEnitiy> existingDeatils = rootCauseMainEnitiyRepo.findById(id);
        if (existingDeatils.isPresent()) {
            return rootCauseMainEnitiyRepo.save(rootCauseMainEnitiy);
        } else {
            throw new RuntimeException("EntityMain not found for id: " + id);
        }
    }
}

