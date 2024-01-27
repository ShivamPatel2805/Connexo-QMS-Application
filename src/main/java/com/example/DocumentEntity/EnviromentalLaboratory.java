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
public class EnviromentalLaboratory {
	
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
    private String SoftwareProcessingStep;
    private String Calculation;
    private String Refer;
    
    @OneToMany(targetEntity =  EnviromentalCriticalStepAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="EnviromentalCriticalStepAttach_fk",referencedColumnName = "id")
    private List< EnviromentalCriticalStepAttach>  enviromentalCriticalStepAttach;
    
    @OneToMany(targetEntity =  EnviromentalFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="EnviromentalFileAttach_fk",referencedColumnName = "id")
    private List<EnviromentalFileAttach>  enviromentalFileAttach;
    
    @OneToMany(targetEntity =  EnviromentalChangeAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="EnviromentalChangeAttach_fk",referencedColumnName = "id")
    private List<EnviromentalChangeAttach>  enviromentalChangeAttach;
    
    
}
