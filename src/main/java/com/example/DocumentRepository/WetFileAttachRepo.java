package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.WetFileAttach;
@Repository
public interface WetFileAttachRepo extends JpaRepository<WetFileAttach,Long>{

}
