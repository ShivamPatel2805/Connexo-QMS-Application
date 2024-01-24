package com.example.AuditProgramEntity;

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
public class AuditGeneralInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String RecordNumber;
	private String DivisionCode;
	private String Initiator;
	private Date DateOfInitiation;
	private String AssignedTo;
	private Date DueDate;
	private String ShortDescription;
	private String InitiatorGroup;
	private String InitiatorGroupCode;
	private String InitiatedThrough;
	private String Others;
	private String Type;
	private String Years;
	private String Quarter;
	private String Description;
	private String Comments;
	private String RelatedUrl;
	private String UrlDescription;
	private String SuggestedAudits;
	private String Zone;
	private String Country;
	private String State;
	private String City;
	private String SevrityLevel;
	private Date DueDateExtensionJustification;
	
	@OneToMany(targetEntity = AuditInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="AuditAttach_fk",referencedColumnName = "id")
    private List<AuditInfoAttach> auditInfoAttach;
	
	@OneToMany(targetEntity = AuditGridAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="AuditGridAttach_fk",referencedColumnName = "id")
    private List<AuditGridAttach> auditGridAttach;
	
	

}
