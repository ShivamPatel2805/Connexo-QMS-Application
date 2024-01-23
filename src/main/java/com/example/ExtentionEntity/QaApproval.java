package com.example.ExtentionEntity;


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
public class QaApproval {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String ApproverComments;
	
	@OneToMany(targetEntity = QaAppAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="QaApprovalAttach_fk",referencedColumnName = "id")
    private List<QaAppAttach> qaApprovalAttach;
	
	@OneToMany(targetEntity = QaApprovalGridAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="QaApprovalGridAttach_fk",referencedColumnName = "id")
    private List<QaApprovalGridAttach> qaApprovalGridAttach;

}
