package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.LaboratoryInterpretationAttach;
@Repository
public interface LaboratoryInterpretationAttachRepo extends JpaRepository<LaboratoryInterpretationAttach, Long>{

}
