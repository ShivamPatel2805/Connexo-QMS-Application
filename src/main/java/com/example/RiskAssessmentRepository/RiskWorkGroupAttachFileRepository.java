package com.example.RiskAssessmentRepository;

import com.example.RiskAssessmentEntity.RiskAnalysisEntity;
import com.example.RiskAssessmentEntity.RiskWorkGroupAttachFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskWorkGroupAttachFileRepository extends JpaRepository<RiskWorkGroupAttachFile, Long>{

}
