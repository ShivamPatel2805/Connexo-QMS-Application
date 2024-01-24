package com.example.InternalAuditEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

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
    private String divisionCode;
    private String initiator;
    private Date dateOfInitiation;
    private String assignedTo;
    private Date dueDate;
    private String initiatorGroup;
    private String initiatorGroupCode;
    private String shortDescription;
    private String initiatedThrough;
    private String typeOfAudit;
    private String otherTypeOfAudit;
    private String initialComments;
    private String initialAttachment;

}
