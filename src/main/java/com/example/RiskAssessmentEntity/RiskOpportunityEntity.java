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
public class RiskOpportunityEntity {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String department;
    private String sourceOfRisk;
    private String siteName;
    private String building;
    private String floor;
    private String room;
    private String relatedRecord;
    private String duration;
    private String hazard;
    private String regulatoryClimate;
    private String numberOfEmployee;
    private String riskManagementStrategy;
}
