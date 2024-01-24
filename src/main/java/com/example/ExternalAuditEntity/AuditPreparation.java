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
public class AuditPreparation {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String LeadAuditor;
    private String auditTeam;
    private String ExternalAuditDetails;
    private String ExternalAuditAgency;
    private String relevantGuideline;
    private String QAcomment;
    private String auditCategory;
    private String supplierDetail;
    private String supplierSite;
    private String comments;

    @OneToMany(targetEntity = ExternalFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ExternalFileAttach_fk",referencedColumnName = "id")
    private List<ExternalFileAttach> externalFileAttach;

    @OneToMany(targetEntity = ExternalGuideAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ExternalGuideAttach_fk",referencedColumnName = "id")
    private List<ExternalGuideAttach> externalGuideAttach;

}
