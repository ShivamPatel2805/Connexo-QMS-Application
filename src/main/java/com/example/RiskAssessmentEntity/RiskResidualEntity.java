package com.example.RiskAssessmentEntity;

import com.example.InternalAuditEntity.InternalFileAttach;
import com.example.InternalAuditEntity.InternalGuidelineAttach;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskResidualEntity {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String residualRisk;
    private String residualRiskImpact;
    private String residualRiskProbability;
    private String residualDetection;
    private String residualRPN;
    private String comments;

}
