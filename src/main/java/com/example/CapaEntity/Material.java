package com.example.CapaEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String MaterialName;
    private String BatchNo;
    private Date ManufacturingDate;
    private Date DateOfExpiry;
    private String BatchDispositionDecision;
    private String Remark;
    private String BatchStatus;

}

