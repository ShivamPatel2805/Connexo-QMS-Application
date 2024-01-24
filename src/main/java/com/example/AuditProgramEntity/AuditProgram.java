package com.example.AuditProgramEntity;

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
public class AuditProgram {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  private String Name;
  
  @OneToMany(targetEntity =AuditGeneralInfo.class,cascade = CascadeType.ALL)
  @JoinColumn(name ="Change_fk",referencedColumnName = "id")
  private List<AuditGeneralInfo> auditGeneralInfo;

}
