package com.example.database.rootcauseanaylsis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.example.database.capaEntity.AdditionalAttach;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootAdditional {

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
    private String CFTReviewRequired;
    private String CFTReviewerPerson;
    private String QAEvaluationComments;


    @OneToMany(targetEntity = RootAdditionalAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootAdditionalAttach_fk", referencedColumnName = "id")
    private List<RootAdditionalAttach> rootAdditionalAttach;

}