package com.example.ChangeControlEntity;

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
public class QaApprovalComments {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String QaApprovalComments;
	private String TrainingFeedback;

	@OneToMany(targetEntity = QaApprovalAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="QaApprovalAttach_fk",referencedColumnName = "id")
    private List<QaApprovalAttach> qaApprovalAttachment;
}
