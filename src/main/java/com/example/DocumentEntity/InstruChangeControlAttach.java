package com.example.DocumentEntity;

import java.sql.Date;
import java.util.List;

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
public class InstruChangeControlAttach {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String RecordId;
	private String Division;
	private String Process;
	private String ShortDescription;
	private Date DateOpened;
	private String AssignedTo;
	private Date DueDate;
	private String Status;

}
