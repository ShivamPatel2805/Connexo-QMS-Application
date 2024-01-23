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
public class ChangeDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String CurrentPractice;
	private String ProposedChange;
	private String ReasonforChange;
	private String AnyOtherComments;
	private String SupervisorComments;
	
	 @OneToMany(targetEntity = ChangeDetailsAttachment.class,cascade = CascadeType.ALL)
	    @JoinColumn(name ="ChangeDeatilsAttach_fk",referencedColumnName = "id")
	    private List<ChangeDetailsAttachment> changeDetailsAttachment;

}
