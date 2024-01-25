package com.example.DocumentEntity;

import java.sql.Date;
import java.util.List;

import com.example.ActionItemEntity.ActionItemInfoAttach;

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
public class DocumentInfo {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String RecordNumber;
	    private String Division;
	    private String Initiator;
	    private Date DateOfInitiation;
	    private String ShortDescription;
	    private Date DueDate;
	    private String NotifyTo;
	    private String Description;
	    private String SopType;
	    private String DepartmentName;
	    private String DocumentType;
	    private String DocumentSubTypeCode;
	    private String DepartmentLanguage;
	    private Date EffectiveDate;
	    private String ReviewPeriod;
	    private String Reviewer;
	    private String Approver;
	    private String RevisionSummary;
	    
	    @OneToMany(targetEntity = DocumentDraftAttach.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="DocumentDraftAttach_fk",referencedColumnName = "id")
	    private List<DocumentDraftAttach> documentDraftAttach;
	    
	    @OneToMany(targetEntity = DocumentEffectiveAttach.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="DocumentEffectiveAttach_fk",referencedColumnName = "id")
	    private List<DocumentEffectiveAttach> documentEffectiveAttach;

}
