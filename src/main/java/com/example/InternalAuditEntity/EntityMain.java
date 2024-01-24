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

    @OneToMany(targetEntity =AuditExecution.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditExecution> auditExecutions;

    @OneToMany(targetEntity = AuditPlanning.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditPlanning> auditPlannings;

    @OneToMany(targetEntity =AuditPreparation.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditPreparation> auditPreparations;

    @OneToMany(targetEntity =AuditRecord.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditRecord> auditRecords;

    @OneToMany(targetEntity =AuditResponse.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditResponse> auditResponses;

}
