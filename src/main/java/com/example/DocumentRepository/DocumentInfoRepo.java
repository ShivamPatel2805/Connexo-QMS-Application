package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.DocumentInfo;
@Repository
public interface DocumentInfoRepo extends JpaRepository< DocumentInfo, Long>{

}
