package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.TrainingInformation;
@Repository
public interface TrainingInformationRepo extends JpaRepository<TrainingInformation, Long>{

}
