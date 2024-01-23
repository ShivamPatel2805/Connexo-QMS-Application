package com.example.ChangeControlEntity;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class GeneralInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String RecordNumber;
    private String Initiator;
    private Date DateofInitiation;
    private String AssignedTo;
    private Date DueDate;
    private String InitiatorGroup;
    private String InitiatorGroupCode;
    private String ShortDescription;
    private String InitiatedThrough;
    private String Repeats;
    private String Others;
    private String RepeatNature;
    private String RiskLevel;
    private String DivisionCode;
    private String NatureOfChange;
    private String IfOthers;
  
    
    @OneToMany(targetEntity = GeneralInfoAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="GeneralInfoAttach_fk",referencedColumnName = "id")
    private List<GeneralInfoAttachment> generalInfoAttachment;

}
