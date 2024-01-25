package com.example.RiskAssessmentRepository;

import com.example.ActionItemEntity.PostCompletion;
import com.example.RiskAssessmentEntity.RiskEntityMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskEntityMainRepository extends JpaRepository<RiskEntityMain, Long>{

}
