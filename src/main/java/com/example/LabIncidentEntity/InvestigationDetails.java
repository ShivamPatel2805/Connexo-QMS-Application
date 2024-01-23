package com.example.LabIncidentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestigationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String InvestigationDetails;
   private String ActionTaken;
   private String RootCause;

    @OneToMany(targetEntity = InvAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Inv_fk",referencedColumnName = "id")
    private List<InvAttachment> invAttachments;

}
