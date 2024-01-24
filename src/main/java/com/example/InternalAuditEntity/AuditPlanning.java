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
@Table(name="AuditPlanning")
public class AuditPlanning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String areaOfAudit;
    private Date scheduledStartDate;
    private String scheduledStartTime;
    private Date scheduledEndDate;
    private String scheduledEndTime;
    private String auditor;
    private String auditee;
    private String remarks;

}
