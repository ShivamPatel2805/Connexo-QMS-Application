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
public class InstrumentSop {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Purpose;
	private String Scope;
	private String[] Response;
	private String Mater;
	private String Proces;
	private String Oper;
	private String Author;
	private String Refrences;
	
	@OneToMany(targetEntity = InstruChangeControlAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InstruChangeControlAttach_fk",referencedColumnName = "id")
    private List<InstruChangeControlAttach> instruChangeControlAttach;
	
	@OneToMany(targetEntity = InstruFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="InstrFileAttach_fk",referencedColumnName = "id")
    private List<InstruFileAttach> instrFileAttach;
	
	
	
	

}
