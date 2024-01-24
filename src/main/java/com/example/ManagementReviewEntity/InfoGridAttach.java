package com.example.ManagementReviewEntity;

import java.sql.Date;
import java.sql.Time;

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
public class InfoGridAttach {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Date Date;
	private String Topic;
	private String Responsible;
	private Time TimeStart;
	private Time TimeEnd;
	private String Comment;

}
