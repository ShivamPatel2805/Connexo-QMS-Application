package com.example.Repository.recordFlowRepo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.recordWorkflow.RecordWorkFlow;

@Repository
public interface RecordWorkFlowRepo extends JpaRepository<RecordWorkFlow, Long> {

    RecordWorkFlow findRecordWorkFlowByIdAndUserId(Long id, Long userId);
}
