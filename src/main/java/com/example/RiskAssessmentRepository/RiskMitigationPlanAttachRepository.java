package com.example.RiskAssessmentRepository;

import com.example.ActionItemEntity.PostCompletion;
import com.example.RiskAssessmentEntity.RiskMitigationPlanAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskMitigationPlanAttachRepository extends JpaRepository<RiskMitigationPlanAttach, Long>{

}
