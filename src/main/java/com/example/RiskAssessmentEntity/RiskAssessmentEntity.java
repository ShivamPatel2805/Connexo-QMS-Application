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
public class RiskAssessmentEntity {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String recordNumber;
    private String locationCode;
    private String initiator;
    private Date dateOfInitiator;
    private String assignedTo;
    private Date   dateDue;
    private String initiatorGroup;
    private String initiatorGroupCode;
    private String shortDescription;
    private String sevrityLevel;
    private String department;
    private String teamMember;
    private String sourceOfRisk;
    private String type;
    private String priorityLevel;
    private String zone;
    private String country;
    private String state;
    private String city;
    private String description;
    private String opportunityDescription;
    private String comments;

}
