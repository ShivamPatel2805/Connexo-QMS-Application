package com.example.RiskAssessmentRepository;

import com.example.RiskAssessmentEntity.RiskAnalysisEntity;
import com.example.RiskAssessmentEntity.RiskWorkGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskWorkGroupEntityRepository extends JpaRepository<RiskWorkGroupEntity, Long>{

}
