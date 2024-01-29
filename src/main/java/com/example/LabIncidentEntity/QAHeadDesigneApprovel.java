package com.example.LabIncidentEntity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QAHeadDesigneApprovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String InvestigationDetails;
   private String EffectivenessCheckrequired;
   private Date EffectivenessCheckCreationDate;
   private String EffectivnessChecker;
   private String Conclusion;
   private String DueDateExtentionJustification;
}
