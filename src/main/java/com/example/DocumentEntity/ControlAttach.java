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
public class ControlAttach {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String RecordId;
	private String Process;
	private String Division;
	private String ShortDescrption;
	private Date DateOpened;
	private String AsignedTo;
	private Date DueDate;
	private String Status;
	
	

}
