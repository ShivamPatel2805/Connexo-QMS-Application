package com.example.ActionItemEntity;


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
public class ActionItemGeneralInfo {
	

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
	
	@OneToMany(targetEntity = ActionItemInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ActionAttach_fk",referencedColumnName = "id")
    private List<ActionItemInfoAttach> actionItemInfoAttach;

}
