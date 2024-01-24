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

    private Date scheduledStartDate;
    private Date scheduledEndDate;
    private String auditor;
    private String product;
    private String comment;

}
