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
public class GroupComments {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String CftComments;
	private String QaComments;
	private String QAHeadDesigneeComments;
	private String WarehouseComments;
	private String EngineeringComments;
	private String InstrumentationComments;
	private String ValidationComments;
	private String OthersComments;
	private String GroupComments;
	
	@OneToMany(targetEntity = GroupCommentsCftAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="groupCommentsCftAttach_fk",referencedColumnName = "id")
    private List<GroupCommentsCftAttach> groupCommentsCftAttach;
	

	@OneToMany(targetEntity = GroupCommentsAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="groupCommentsAttach_fk",referencedColumnName = "id")
    private List<GroupCommentsAttach> groupCommentsAttach;
	

}
