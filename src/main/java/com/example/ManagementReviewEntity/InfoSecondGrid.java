package com.example.ManagementReviewEntity;

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
public class InfoSecondGrid {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String InvitedPerson;
	private String Designee;
	private String Department;
	private String MeetingAttended;
	private String DesigneeName;
	private String DesigneeDepartmentDesignation;
	private String Remarks;

}
