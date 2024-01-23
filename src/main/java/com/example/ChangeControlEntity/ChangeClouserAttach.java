package com.example.ChangeControlEntity;

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
public class ChangeClouserAttach {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String AffectedDocuments;
	private String DocumentName;
	private String DocumentNo;
	private String VersionNo;
	private Date ImplementationDate;
	private String 	NewDocumentNo;
	private String NewsVersionNo;

}
