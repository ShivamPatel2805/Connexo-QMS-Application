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
@Table(name = "AuditResponse")
public class AuditResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String remarks;

    private Integer referenceRecordId;

    private String auditComments;

    private Date dueDateExtensionJustification;



    @OneToMany(targetEntity = InternalInitialAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InternalInitialAttach_fk",referencedColumnName = "id")
    private List<InternalInitialAttach> internalInitialAttache;

    @OneToMany(targetEntity = InternalAuditClosureAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InternalAuditClosureAttach_fk",referencedColumnName = "id")
    private List<InternalAuditClosureAttach> internalAuditClosureAttache;
}
