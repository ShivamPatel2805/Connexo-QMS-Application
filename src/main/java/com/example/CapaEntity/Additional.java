package com.example.CapaEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Additional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String GroupReviewRequired;
    private String Production;
    private String QualityApprover;
    private String Others;
    private String ProductionPerson;
    private String QualityApproverPerson;
    private String OthersPerson;

    @OneToMany(targetEntity = AdditionalAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "AdditionalAttach_fk", referencedColumnName = "id")
    private List<AdditionalAttach> additionalAttach;

}
