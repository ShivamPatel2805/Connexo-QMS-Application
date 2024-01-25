package com.example.ManagementReviewEntity;

import java.sql.Date;

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
public class ClouserSecondGrid {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String CapaDetails;
	private String CapaType;
	private String SiteDivision;
	private String PersonResponsible;
	private String CurrentStatus;
	private Date DateClosed;
	private String Remark;

}
