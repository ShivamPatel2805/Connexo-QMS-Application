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
public class WetChemestry {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Purpose;
    private String Scope;
    private String[] Response;
    private String Mater;
    private String Equipment;
    private String Safety;
    private String Proce;
    private String SoftwareProcessingStep;
    private String Calculation;
    private String Refer;
    
    @OneToMany(targetEntity = WetCriticalAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="WetCriticalAttach_fk",referencedColumnName = "id")
    private List<WetCriticalAttach> wetCriticalAttach;
    
    @OneToMany(targetEntity = WetChangeAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="WetChangeAttach_fk",referencedColumnName = "id")
    private List<WetChangeAttach> wetChangeAttach;
    
    @OneToMany(targetEntity = WetFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="WetFileAttach_fk",referencedColumnName = "id")
    private List<WetFileAttach> wetFileAttach;

}
