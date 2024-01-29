package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.LaboratoryPractices;
@Repository
public interface LaboratoryPracticesRepo extends JpaRepository<LaboratoryPractices, Long>{

}
