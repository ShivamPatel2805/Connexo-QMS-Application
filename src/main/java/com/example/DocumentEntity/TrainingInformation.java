package com.example.DocumentEntity;

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
public class TrainingInformation {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String TrainingRequired;
	private String Trainer;
	private String Comments;
	
	@OneToMany(targetEntity = TrainingTestAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="TrainingTestAttach_fk",referencedColumnName = "id")
    private List<TrainingTestAttach> trainingTestAttach;
	
	@OneToMany(targetEntity = TrainingSurvey.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="TrainingSurvey_fk",referencedColumnName = "id")
    private List<TrainingSurvey> trainingSurvey;

}
