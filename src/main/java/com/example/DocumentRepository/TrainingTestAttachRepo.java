package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.TrainingTestAttach;
@Repository
public interface TrainingTestAttachRepo extends JpaRepository<TrainingTestAttach, Long>{

}
