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
public class ChemestrySop {
  
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Purpose;
	private String ScopeField;
    private String  Material;
    private String Equipment;
    private String Safety;
    private String Process;
    private String Refer;
    private String[] Respons;
    
    @OneToMany(targetEntity = InteroretationAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InteroretationAttach_fk",referencedColumnName = "id")
    private List<InteroretationAttach> interoretationAttach;
    
    @OneToMany(targetEntity = ControlAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ControlAttach_fk",referencedColumnName = "id")
    private List<ControlAttach> controlAttach;
    
    @OneToMany(targetEntity = ChemestryFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ChemestryFileAttach_fk",referencedColumnName = "id")
    private List<ChemestryFileAttach> chemestryFileAttach;
    
    @OneToMany(targetEntity = ProceduresAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ProceduresAttach_fk",referencedColumnName = "id")
    private List<ProceduresAttach> proceduresAttach;
	

}
