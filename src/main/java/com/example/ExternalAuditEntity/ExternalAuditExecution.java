package com.example.ExternalAuditEntity;
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
public class ExternalAuditExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Date auditStartDate;


    private Date auditEndDate;



    private String auditComments;

    @OneToMany(targetEntity = ExternalAuditAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ExternalAuditAttach_fk",referencedColumnName = "id")
    private List<ExternalAuditAttach> externalAuditAttach;


}
