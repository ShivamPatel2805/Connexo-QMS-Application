package com.example.ExtentionEntity;


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
public class ExtentionGeneralInformation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String RecordNumber;
	private String DivisionCode;
	private String Initiator;
	private Date DateoFInitiation;
	private Date CurrentParentDueDate;
	private String ShortDescription;
	private String JustificationOfExtention;
	private String Approver;
	
	@OneToMany(targetEntity = ExtentionGeneralInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="GenAttach_fk",referencedColumnName = "id")
    private List<ExtentionGeneralInfoAttach> extentionGeneralInfoAttach;
	
	@OneToMany(targetEntity = ExtentionGeneralInfoGridAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="GridAttach_fk",referencedColumnName = "id")
    private List<ExtentionGeneralInfoGridAttach> extentionGeneralInfoGridAttach;
	

}
