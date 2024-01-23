package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ChangeControlEntity.RiskAssessment;
@Repository
public interface RiskAssessmentRepo extends JpaRepository<RiskAssessment, Long>{

}
