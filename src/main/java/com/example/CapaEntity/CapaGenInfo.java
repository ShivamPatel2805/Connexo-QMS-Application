package com.example.CapaEntity;

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
public class CapaGenInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String RecordNumber;
    private String Initiator;
    private String AssignedTo;
    private String InitiatorGroup;
    private String ShortDescription;
    private String SevrityLevel;
    private String InitiatedThrough;
    private String Repeats;
    private String ProblemDescription;
    private String CapaTeam;
    private String ReferenceRecords;
    private String InitialObservation;
    private String InterimContainnment;
    private String ContainmentComments;
    private String LocationCode;
    private Date DateofInitiation;
    private Date DueDate;
    private int InitiatorGroupCode;
    private String Others;
    private String RepeatsNature;
    //private String CapaAttachment;


    @OneToMany(targetEntity = CapaGeneralInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
    private List<CapaGeneralInfoAttach> capaGeneralInfoAttach;

}
