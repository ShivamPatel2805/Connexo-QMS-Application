package com.example.ManagementReviewEntity;

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
public class Meetings {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String RiskOpportunities;
	private String ExternalSupplierPerformance;
	private String CustomerSatisfactionLevel;
	private String BudgetEstimates;
	private String CompletionofPreviousTasks;
	private String Production;
	private String Plans;
	private String Forecast;
	private String AnyAdditionalSupportRequired;
	
	@OneToMany(targetEntity = MeetingsAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="MeetingsAttach_fk",referencedColumnName = "id")
    private List<MeetingsAttach> meetingsAttach;
	
	

}
