package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.IfOthersCriticalStepAttach;
@Repository
public interface EnviromentalCriticalStepAttachRepo extends JpaRepository<IfOthersCriticalStepAttach, Long>{

}
