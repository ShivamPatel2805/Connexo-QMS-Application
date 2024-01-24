package com.example.InternalAuditEntity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EntityMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @OneToMany(targetEntity =InternalAuditExecution.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<InternalAuditExecution> auditExecutions;

    @OneToMany(targetEntity = InternalAuditPlanning.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<InternalAuditPlanning> auditPlannings;

    @OneToMany(targetEntity =InternalAuditPreparation.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<InternalAuditPreparation> auditPreparations;

    @OneToMany(targetEntity =InternalAuditRecord.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<InternalAuditRecord> auditRecords;

    @OneToMany(targetEntity =InternalAuditResponse.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<InternalAuditResponse> auditResponses;

}
