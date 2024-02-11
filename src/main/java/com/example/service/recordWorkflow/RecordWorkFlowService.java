package com.example.service.recordWorkflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.recordFlowRepo.RecordWorkFlowRepo;
import com.example.database.recordWorkflow.RecordWorkFlow;

import java.util.Optional;

@Service
public class RecordWorkFlowService {

    @Autowired
    private RecordWorkFlowRepo repo;

    public RecordWorkFlow getById(Long id) {
        Optional<RecordWorkFlow> existDeatils = repo.findById(id);
        return existDeatils.get();
    }

    public RecordWorkFlow getByIdwithCurrentUser(Long id, Long userId) {
        RecordWorkFlow existDetail = repo.findRecordWorkFlowByIdAndUserId(id, userId);
        return existDetail;
    }

    //update Records
    public RecordWorkFlow updateRecordFlow(Long id, RecordWorkFlow data) {
        Optional<RecordWorkFlow> existDeatils = repo.findById(id);
        if (existDeatils.isPresent()) {
            return repo.save(data);
        } else {
            return null;
        }
    }

    public RecordWorkFlow saveMaterial(RecordWorkFlow data) {
        return repo.save(data);
    }
}
