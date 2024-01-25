package com.example.RiskAssessmentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskAnalysisEntityAttach {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String riskFactor;
    private String riskElement;
    private String probableCauseOfRiskElement;
    private String existingRiskControls;
    private String initialSeverity;
    private String initialProbability;
    private String initialDetectability;
    private String riskAcceptance;
    private String proposedAdditionalRiskControlMeasure;
    private String residualSeverity;
    private String residualProbability;
    private String residualDetectability;
    private String mitigationProposal;
    //private String residualRPN;
    //private String riskAcceptance;
    // private String initialRPN;

}
