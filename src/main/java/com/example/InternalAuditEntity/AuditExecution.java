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
@Table(name = "AuditExecution")
public class AuditExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private Date auditStartDate;

    private Date auditEndDate;

    private String auditComments;

    @OneToMany(targetEntity = InternalAuditAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InternalAuditAttach_fk",referencedColumnName = "id")
    private List<InternalAuditAttach> internalAuditAttache;


}
