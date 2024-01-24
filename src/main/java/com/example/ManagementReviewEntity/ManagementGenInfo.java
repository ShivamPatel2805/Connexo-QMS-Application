package com.example.ManagementReviewEntity;

import java.sql.Date;
import java.util.List;

import com.example.AuditProgramEntity.AuditInfoAttach;

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
public class ManagementGenInfo {
	
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
	private String Type;
	private String PriorityLevel;
	private Date ScheduledStartDate;
	private Date ScheduledEndDate;
	private String Description;
	private String Attendess;
	
	
	@OneToMany(targetEntity = InfoGridAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="GridAttach_fk",referencedColumnName = "id")
    private List<InfoGridAttach> infoGridAttach;
	
	@OneToMany(targetEntity = InfoSecondGrid.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="SecondGridAttach_fk",referencedColumnName = "id")
    private List<InfoSecondGrid> InfoSecondGrid;
	
	@OneToMany(targetEntity = ManageFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="FileAttach_fk",referencedColumnName = "id")
    private List<ManageFileAttach> manageFileAttach;
	
	

}
