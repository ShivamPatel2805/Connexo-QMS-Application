package com.example.RiskAssessmentEntity;

import com.example.InternalAuditEntity.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RiskEntityMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @OneToMany(targetEntity = RiskAssessmentEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskAssessmentEntity_fk",referencedColumnName = "id")
    private List<RiskAssessmentEntity> riskAssessmentEntities;

    @OneToMany(targetEntity = RiskOpportunityEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskOpportunityEntity_fk",referencedColumnName = "id")
    private List<RiskOpportunityEntity> riskOpportunityEntities;

    @OneToMany(targetEntity = RiskWorkGroupEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskWorkGroupEntity_fk",referencedColumnName = "id")
    private List<RiskWorkGroupEntity> riskWorkGroupEntities;

    @OneToMany(targetEntity = RiskAnalysisEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskAnalysisEntity_fk",referencedColumnName = "id")
    private List<RiskAnalysisEntity> riskAnalysisEntities;

    @OneToMany(targetEntity = RiskResidualEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskResidualEntity_fk",referencedColumnName = "id")
    private List<RiskResidualEntity> riskResidualEntities;

    @OneToMany(targetEntity = RiskMitigationEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskMitigationEntity_fk",referencedColumnName = "id")
    private List<RiskMitigationEntity> riskMitigationEntities;

}
