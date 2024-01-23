package com.example.ExtentionEntity;



import java.util.List;

import com.example.ChangeControlEntity.GeneralInfo;

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
public class Extention {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  private String Name;
	  
	  @OneToMany(targetEntity =ExtentionGeneralInformation.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<ExtentionGeneralInformation> extentionGeneralInformation;
	  
	  @OneToMany(targetEntity =QaApproval.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<QaApproval> qaApproval;

}
