package com.example.DocumentEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstruCheCriticalAttach {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Step;
	private String Reasons;
	private String ExpectedTestOutcomes;
	private String AcceptableValues;
	private String Attachment;
	private String Remark;
	

}
