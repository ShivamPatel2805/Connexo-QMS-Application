package com.example.ExternalAuditEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExternalAuditMain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @OneToMany(targetEntity = AuditRecord.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditRecord> auditRecord;

    @OneToMany(targetEntity = AuditExecution.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditExecution> auditExecution;

    @OneToMany(targetEntity = AuditPreparation.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditPreparation> auditPreparation;

    @OneToMany(targetEntity = AuditPlanning.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditPlanning> auditPlanning;

    @OneToMany(targetEntity = AuditResponse.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<AuditResponse> auditResponse;

}
