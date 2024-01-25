package com.example.RiskAssessmentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskMitigationPlanAttach {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mitigationSteps;
    private Date deadline;
    private String responsiblePerson;
    private String status;
    private String remarks;

}
