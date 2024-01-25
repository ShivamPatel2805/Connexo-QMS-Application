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

public class RiskAnalysisEntity {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String rootCauseMethodology;
    private String rootCauseDescription;
    private String investigationSummary;
    private String severityRate;
    private String occurence;
    private String detection;
    private String rpn;

    @OneToMany(targetEntity = RiskAnalysisEntityAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskAnalysisEntityAttach_fk",referencedColumnName = "id")
    private List<RiskAnalysisEntityAttach> riskAnalysisEntityAttaches   ;
}
