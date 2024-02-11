package com.example.database.rootcauseanaylsis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LabInvestigatorConclusion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(targetEntity = LabInvestigatorAttachments.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="labInvestigatorId",referencedColumnName = "id")
    private List<LabInvestigatorAttachments> attach;


}
