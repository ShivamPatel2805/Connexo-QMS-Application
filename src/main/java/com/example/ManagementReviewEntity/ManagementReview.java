package com.example.ManagementReviewEntity;

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
public class ManagementReview {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  private String Name;
	  
	  @OneToMany(targetEntity =ManagementGenInfo.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<ManagementGenInfo> managementGenInfo;
	  
	  @OneToMany(targetEntity =OperationPlanning.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<OperationPlanning> operationPlanning;
	  
	  @OneToMany(targetEntity =Meetings.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<Meetings> meetings;
	  

	  @OneToMany(targetEntity =Clouser.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<Clouser> clouser;

}
