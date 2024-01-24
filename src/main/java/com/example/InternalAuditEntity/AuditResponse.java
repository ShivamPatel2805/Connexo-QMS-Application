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
@Table(name = "AuditResponse")
public class AuditResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String remarks;

    private Integer referenceRecordId;

    private String reportAttachments;

    private String auditAttachments;

    private String auditComments;

    private Date dueDateExtensionJustification;

}
