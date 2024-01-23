package com.example.ChangeControlEntity;

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
public class Evalution {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String QAEvaluationComments;
	private String TrainingRequired;
	private String TrainingComments;
	
	
	 @OneToMany(targetEntity = EvalutionAttachment.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="EvalutionAttach_fk",referencedColumnName = "id")
	    private List<EvalutionAttachment> evalutionAttachment;

}
