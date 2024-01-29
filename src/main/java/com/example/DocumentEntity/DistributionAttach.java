package com.example.DocumentEntity;

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
public class DistributionAttach {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String DocumentTitle;
	private String DocumentNumber;
	private String DocumentPrintedBy;
	private String DocumentPrintedon;
	private String NumberofPrintCopies;
	private Date IssuanceDate;
	private String IssuedTo;
	private String DepartmentLocation;
    private String NumberofIssuedCopies;
    private String ReasonforIssuance;
    private Date RetrievalDate;
    private String RetrievedBy;
    private String RetrievedPersonDepartment;
    private String NumberofRetrievedCopies;
    private String ReasonforRetrieval;
    private String Remarks;
    
}
