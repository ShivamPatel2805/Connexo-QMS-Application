package com.example.ExternalAuditEntity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditPlanning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String areaOfAudit;
    private Date scheduledStartDate;

    private Date scheduledEndDate;

    private String product;
    private String comment;

}
