package com.example.AuditProgramEntity;

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
public class AuditGridAttach {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String Auditees;
	private Date StartDate;
	private String EndDate;
	private String LeadInvestigator;
	private String Comment;

}
