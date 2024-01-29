package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.DocumentEffectiveAttach;

@Repository
public interface DocumentEffectiveAttachRepo extends JpaRepository<DocumentEffectiveAttach, Long>{

}
