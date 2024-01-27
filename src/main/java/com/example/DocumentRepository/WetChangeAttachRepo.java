package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.WetChangeAttach;
@Repository
public interface WetChangeAttachRepo extends JpaRepository<WetChangeAttach, Long>{

}
