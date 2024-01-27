package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.InstruCheFileAttach;
@Repository
public interface InstruCheFileAttachRepo extends JpaRepository<InstruCheFileAttach, Long>{

}
