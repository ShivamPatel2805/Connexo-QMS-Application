package com.example.ChangeControlEntity;

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
public class ChangeClouser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String QaClosureComments;
	private String EffectivessCheckRequired;
	private Date EffectivenessCheckCreationDate;
	private String EffectivenessChecker;
	private String EffectivenessCheckPlan;
	private Date DueDateExtensionJustification;
	
	@OneToMany(targetEntity = ChangeClouserAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ChangeClouserAttach_fk",referencedColumnName = "id")
    private List<ChangeClouserAttach> changeClouserAttach;
	
	@OneToMany(targetEntity = ChangeClouserInitialAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ChangeClouserInitialAttach_fk",referencedColumnName = "id")
    private List<ChangeClouserInitialAttach> changeClouserInitialAttach;

}
