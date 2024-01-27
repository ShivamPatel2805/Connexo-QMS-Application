package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.MicroInterpretationAttach;
@Repository
public interface MicroInterpretationAttachRepo extends JpaRepository<MicroInterpretationAttach, Long>{

}
