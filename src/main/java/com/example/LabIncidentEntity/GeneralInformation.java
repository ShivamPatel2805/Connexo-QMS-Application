package com.example.LabIncidentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class GeneralInformation {
    //private int id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String RecordNumber ;
    private String DivisionCode;
    private String Initiator;
    private String AssignedTo;
    private Date DueDate;
    private String InitiatorGroup;
    private String ShortDescription;

    private String IncidentCategory;
    private String InvocationType;

    /*========================For_File_Attachment===========================*/
    @OneToMany(targetEntity = InitialAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InitialAttach_fk",referencedColumnName = "id")
    private List <InitialAttachment> initialAttachments;

    /*=============================/////////===================================*/

}
