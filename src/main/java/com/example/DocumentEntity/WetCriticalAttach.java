package com.example.DocumentEntity;

import java.sql.Date;

import org.springframework.stereotype.Component;

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
@Component
public class WetCriticalAttach {
	
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
