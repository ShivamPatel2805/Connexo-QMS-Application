package com.example.ChangeControlEntity;

import java.util.List;

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
public class RiskAssessment {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String RiskIdentification;
	private String SeverityRate;
	private String  Occurrence;
	private String Detection;
	private String  RPN;
	private String RiskEvaluation;
	private String MigrationAction;
	
	@OneToMany(targetEntity = RiskAssessmentAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskAssessmentAttach_fk",referencedColumnName = "id")
    private List<RiskAssessmentAttach> riskAssessmentAttach;

}
