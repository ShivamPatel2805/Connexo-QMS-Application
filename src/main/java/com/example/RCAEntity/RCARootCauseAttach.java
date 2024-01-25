package com.example.RCAEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class RCARootCauseAttach {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rootCauseCategory;
    private String rootCauseSubCategory;
    private String Probability;
    private String Remark;
  

}
