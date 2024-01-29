package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.MicroChangeAttach;
@Repository
public interface MicroChangeAttachRepo extends JpaRepository<MicroChangeAttach, Long>{

}
