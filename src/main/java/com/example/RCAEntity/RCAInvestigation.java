package com.example.RCAEntity;

import com.example.ExternalAuditEntity.AuditExecution;
import com.example.ExternalAuditEntity.AuditPreparation;
import com.example.ExternalAuditEntity.AuditRecord;
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
public class RCAInvestigation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originator;
    private Date dateOpened;
    private Date dateOfInitiation;
    private String shortDescription;
    private String securityLevel;
    private String assignedTo;
    private Date dateDue;
    private String type;
    private String priorityLevel;
    private String additionalInvestigators;
    private String departments;
    private String description;
    private String comments;
    private String relatedURL;


    @OneToMany(targetEntity = RCAInitialAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCAInitialAttach_fk",referencedColumnName = "id")
    private List<RCAInitialAttach> rCAInitialAttach;





}
