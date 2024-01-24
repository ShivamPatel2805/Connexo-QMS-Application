package com.example.InternalAuditEntity;

import com.example.ActionItemEntity.ActionItemInfoAttach;
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
@Table(name="AuditRecord")
public class AuditRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String recordNumber;
    private String LocationCode;
    private String initiator;
    private Date dateOfInitiation;
    private String assignedTo;
    private Date dueDate;
    private String initiatorGroup;
    private String initiatorGroupCode;
    private String shortDescription;
    private String initiatedThrough;
    private String initiatedThroughOthers;
    private String typeOfAudit;
    private String typeOfAuditOthers;
    private String externalAgencies;
    private String externalAgenciesOthers;
    private String description;
    private String initialComments;

    @OneToMany(targetEntity = InternalInitialAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InternalInitialAttach_fk",referencedColumnName = "id")
    private List<InternalInitialAttach> internalInitialAttach;



}
