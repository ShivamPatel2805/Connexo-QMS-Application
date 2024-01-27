package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.EnviromentalCriticalStepAttach;
@Repository
public interface EnviromentalCriticalStepAttachRepo extends JpaRepository<EnviromentalCriticalStepAttach, Long>{

}
