package com.example.database.capaEntity;

import com.google.gson.Gson;
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
    private String recordNumber;
    private String recordName;
    private String initiator;
    private String assignedTo;
    private String initiatorGroup;
    private String initiatorGroupCode;
    private String shortDescription;
    private String securityLevel;
    private String initiatedThrough;
    private String repeats;
    private String problemDescription;
    private String multiPerson;
    private String initialObservation;
    private String interimContainment;
    private String containmentComments;
    private String locationCode;
    private Date dueofInitiation;
    private Date dueDate;
    private String currentstatus;
    private String others;
    private String repeatsNature;
    private String process;
    private List<String> referencesRecords;

    @OneToMany(targetEntity = CapaGeneralInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "capaGeneralInfoId", referencedColumnName = "id")
    private List<CapaGeneralInfoAttach> capaGeneralInfoAttach;


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }


}
