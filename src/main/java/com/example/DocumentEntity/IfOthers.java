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
public class IfOthers {
	
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
    
    @OneToMany(targetEntity =  IfOthersCriticalStepAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="EnviromentalCriticalStepAttach_fk",referencedColumnName = "id")
    private List< IfOthersCriticalStepAttach>  enviromentalCriticalStepAttach;
    
    @OneToMany(targetEntity =  IfOthersFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="EnviromentalFileAttach_fk",referencedColumnName = "id")
    private List<IfOthersFileAttach>  enviromentalFileAttach;
    
    @OneToMany(targetEntity =  IfOthersChangeAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="EnviromentalChangeAttach_fk",referencedColumnName = "id")
    private List<IfOthersChangeAttach>  enviromentalChangeAttach;
    
    
}
