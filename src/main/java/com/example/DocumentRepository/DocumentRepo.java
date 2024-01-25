package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.Document;
@Repository
public interface DocumentRepo extends JpaRepository<Document, Long>{

}
