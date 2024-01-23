package com.example.ActionItemEntity;

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
public class ActionItem {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  private String Name;
	  
	  @OneToMany(targetEntity =ActionItemGeneralInfo.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<ActionItemGeneralInfo> actionItemGeneralInfo;
	  
	  @OneToMany(targetEntity =PostCompletion.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<PostCompletion> postCompletion;
	  
	  @OneToMany(targetEntity =ActionApproval.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="Change_fk",referencedColumnName = "id")
	    private List<ActionApproval> actionApproval;

}
