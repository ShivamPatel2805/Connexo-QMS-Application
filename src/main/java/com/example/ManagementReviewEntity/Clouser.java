package com.example.ManagementReviewEntity;

import java.sql.Date;
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
public class Clouser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Date NextManagementReviewDate;
	private String SummaryRecommendation;
	private String Conclusion;
	private Date DueDateExtensionJustification;
	
	@OneToMany(targetEntity = ClouserFileAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ClouserFileAttach_fk",referencedColumnName = "id")
    private List<ClouserFileAttach> clouserFileAttach;
	
	@OneToMany(targetEntity = ClouserFirstGrid.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ClouserFirstGrid_fk",referencedColumnName = "id")
    private List<ClouserFirstGrid> clouserFirstGrid;
	
	@OneToMany(targetEntity = ClouserSecondGrid.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ClouserSecondGrid_fk",referencedColumnName = "id")
    private List<ClouserSecondGrid> clouserSecondGrid;

}
