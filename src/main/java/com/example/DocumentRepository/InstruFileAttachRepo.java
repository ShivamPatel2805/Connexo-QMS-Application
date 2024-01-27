package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.InstruFileAttach;
@Repository
public interface InstruFileAttachRepo extends JpaRepository<InstruFileAttach, Long>{

}
