package com.example.ExternalAuditEntity;

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
public class ExternalAuditAttach {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String TitleOfDocument;
    private String AttachedFile;
    private String Remark;
  

}
