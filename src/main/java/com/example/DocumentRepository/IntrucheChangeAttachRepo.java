package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.InstruCheChangeAttach;
@Repository
public interface IntrucheChangeAttachRepo extends JpaRepository<InstruCheChangeAttach, Long>{

}
