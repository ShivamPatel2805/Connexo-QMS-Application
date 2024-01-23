package com.example.ChangeControlEntity;

import org.springframework.stereotype.Component;

import com.example.LabIncidentEntity.CapaAttachment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class GeneralInfoAttachment {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String TitleOfDocument;
    private String AttachedFile;
    private String Remark;
}
