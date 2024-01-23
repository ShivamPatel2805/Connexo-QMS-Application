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
public class AdditionalInformation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String CftReviewer;
	private String CftReviewerPerson;
	private String IsConcernedGroupReviewRequired;
	private String Production;
	private String ProductionPerson;
	private String QualityApprover;
	private String QualityApproverPerson;
	private String Others;
	private String OthersPerson;
	
	
	@OneToMany(targetEntity = AdditionalInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="AdditionalInfoAttach_fk",referencedColumnName = "id")
    private List<AdditionalInfoAttach> additionalInfoAttach;

}
