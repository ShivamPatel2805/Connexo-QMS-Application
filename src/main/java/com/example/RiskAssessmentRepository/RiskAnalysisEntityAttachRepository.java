package com.example.RiskAssessmentRepository;

import com.example.ActionItemEntity.PostCompletion;
import com.example.RiskAssessmentEntity.RiskAnalysisEntityAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskAnalysisEntityAttachRepository extends JpaRepository<RiskAnalysisEntityAttach, Long>{

}
