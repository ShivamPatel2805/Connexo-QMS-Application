package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.InstruChangeControlAttach;
@Repository
public interface InstruChangeControlAttachRepo extends JpaRepository<InstruChangeControlAttach, Long>{

}
