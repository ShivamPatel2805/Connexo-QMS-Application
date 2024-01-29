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

public class InstruChemestrySop {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Purpose;
	private String Scope;
	private String[] Respo;
	private String Mater;
	private String Proce;
	private String Calculation;
	private String Refer;
	
	@OneToMany(targetEntity = InstruCheFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InstruCheFileAttach_fk",referencedColumnName = "id")
    private List<InstruCheFileAttach> instruCheFileAttach;
	
	@OneToMany(targetEntity = InstruCheChangeAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InstruCheChangeAttach_fk",referencedColumnName = "id")
    private List<InstruCheChangeAttach> instruCheChangeAttach;
	
	@OneToMany(targetEntity = InstruCheCriticalAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InstruCheCriticalAttach_fk",referencedColumnName = "id")
    private List<InstruCheCriticalAttach> instruCheCriticalAttach;
	
	
	
	

}
