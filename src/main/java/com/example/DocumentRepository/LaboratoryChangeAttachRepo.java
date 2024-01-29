package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.LaboratoryChangeAttach;
@Repository
public interface LaboratoryChangeAttachRepo extends JpaRepository<LaboratoryChangeAttach, Long>{

}
