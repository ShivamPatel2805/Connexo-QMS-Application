package com.example.ExternalAuditEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String remarks;

    private Integer referenceRecordId;



    private String auditComments;
    private Date dueDateExtensionJustification;

    @OneToMany(targetEntity = ExternalReportAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ExternalReportAttach_fk",referencedColumnName = "id")
    private List<ExternalReportAttach> externalReportAttach;

    @OneToMany(targetEntity = ExternalAuditClosureAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ExternalAuditClosureAttach_fk",referencedColumnName = "id")
    private List<ExternalAuditClosureAttach> externalAuditClosureAttach;




}
