package com.example.RiskAssessmentRepository;

import com.example.ActionItemEntity.PostCompletion;
import com.example.RiskAssessmentEntity.RiskMitigationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskMitigationEntityRepository extends JpaRepository<RiskMitigationEntity, Long>{

}
