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
@Table(name="AuditPreparation")
public class AuditPreparation {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String preparationNumber;
    private String assignedTo;
    private Date dateOfAssignment;
    private Date dueDate;
    private String preparationGroup;
    private String preparationGroupCode;
    private String shortDescription;
    private String preparationType;
    private String otherPreparationType;
    private String initialComments;
    private String initialAttachment;
}
