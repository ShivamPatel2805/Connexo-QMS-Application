package com.example.DocumentEntity;

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
public class LaboratoryPractices {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Purpose;
	private String Scope;
	private String[]Response;
	private String Mater;
	private String Equipment;
	private String Safety;
	private String Proce;
	
	@OneToMany(targetEntity = LaboratoryInterpretationAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="LaboratoryInterpretationAttach_fk",referencedColumnName = "id")
    private List<LaboratoryInterpretationAttach> laboratoryInterpretationAttach;
	
	@OneToMany(targetEntity = LaboratoryFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="LaboratoryFileAttach_fk",referencedColumnName = "id")
    private List<LaboratoryFileAttach> laboratoryFileAttach;
	
	@OneToMany(targetEntity = LaboratoryChangeAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="LaboratoryChangeAttach_fk",referencedColumnName = "id")
    private List<LaboratoryChangeAttach> laboratoryChangeAttach;
	

}
