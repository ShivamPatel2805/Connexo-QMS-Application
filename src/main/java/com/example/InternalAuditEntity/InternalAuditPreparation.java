package com.example.InternalAuditEntity;
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
@Table(name="AuditPreparation")
public class InternalAuditPreparation {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String leadAuditor;
    private String auditTeam;
    private String externalAuditDetails;
    private String externalAuditingAgency;
    private String relevantGuideline;
    private String QAComments;
    private String auditCategory;
    private String supplierDetail;
    private String supplierSite;
    private String comments;



    @OneToMany(targetEntity = InternalFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InternalFileAttach_fk",referencedColumnName = "id")
    private List<InternalFileAttach> internalFileAttache;

    @OneToMany(targetEntity = InternalGuidelineAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InternalGuideLineAttach_fk",referencedColumnName = "id")
    private List<InternalGuidelineAttach> internalGuidelineAttache;
}
