package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.DocumentDraftAttach;
@Repository
public interface DocumentDraftAttachRepo extends JpaRepository<DocumentDraftAttach, Long>{

}
