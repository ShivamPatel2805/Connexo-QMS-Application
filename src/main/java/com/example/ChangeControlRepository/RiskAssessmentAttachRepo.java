package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.RiskAssessmentAttach;
@Repository
public interface RiskAssessmentAttachRepo extends JpaRepository<RiskAssessmentAttach, Long>{

}
