package com.example.RiskAssessmentDtos;

import com.example.InternalAuditEntity.InternalEntityMain;
import com.example.RiskAssessmentEntity.RiskEntityMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RiskAssessmentDtos {
    private RiskEntityMain riskEntityMain;
}
