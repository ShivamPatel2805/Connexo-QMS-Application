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
public class MicrobiologySop {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Purpose;
	private String Scope;
	private String[] Response;
	private String Mater;
	private String Equipment;
	private String Safety;
	private String Proces;
	
	@OneToMany(targetEntity = MicroInterpretationAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="MicroInterpretationAttach_fk",referencedColumnName = "id")
    private List<MicroInterpretationAttach> microInterpretationAttach;
	

	@OneToMany(targetEntity = MicroFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="MicroFileAttach_fk",referencedColumnName = "id")
    private List<MicroFileAttach> microFileAttach;
	
	@OneToMany(targetEntity = MicroChangeAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="MicroChangeAttach_fk",referencedColumnName = "id")
    private List<MicroChangeAttach> microChangeAttach;

}
