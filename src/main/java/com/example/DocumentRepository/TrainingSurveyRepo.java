package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.TrainingSurvey;
@Repository
public interface TrainingSurveyRepo extends JpaRepository<TrainingSurvey, Long>{

}
