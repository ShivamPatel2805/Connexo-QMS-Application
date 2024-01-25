package com.example.RiskAssessmentEntity;

import com.example.InternalAuditEntity.InternalFileAttach;
import com.example.InternalAuditEntity.InternalGuidelineAttach;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskMitigationEntity {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mitigationRecquired;
    private String mitigationPlan;
    private Date scheduleEndDate;
    private String statusOfMitigation;
    private String mitigationStatusComments;
    private String impact;
    private String criticality;
    private String impactAnalysis;
    private String riskAnalysis;
    private String referenceRecord;
    private Date dueDateExtensionJustification;

    @OneToMany(targetEntity = RiskMitigationPlanAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskMitigationPlanAttach_fk",referencedColumnName = "id")
    private List<RiskMitigationPlanAttach> riskMitigationPlanAttaches;
}
