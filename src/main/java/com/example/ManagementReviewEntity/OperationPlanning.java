package com.example.ManagementReviewEntity;

import java.sql.Date;
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
public class OperationPlanning {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	 
	private String Operations;
	private String RequirementsforProductsandServices;
	private String DesignandDevelopmentofProductsandServices;
	private String ControlofExternallyProvidedProcessesProductsandServices;
	private String ProductionandServiceProvision;
	private String ReleaseofProductsandServices;
	private String ControlofNonconformingOutputs;
	
	@OneToMany(targetEntity = OperationAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="OperationAttach_fk",referencedColumnName = "id")
    private List<OperationAttach> operationAttach;
	
	

}
