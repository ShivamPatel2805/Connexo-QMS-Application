package com.example.RiskAssessmentRepository;

import com.example.ActionItemEntity.PostCompletion;
import com.example.RiskAssessmentEntity.RiskWorkGroupActionplanAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskWorkGroupActionplanAttachRepository extends JpaRepository<RiskWorkGroupActionplanAttach, Long>{

}
