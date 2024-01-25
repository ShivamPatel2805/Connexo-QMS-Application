package com.example.CapaEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EffectivenessCheck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String EffectivenessCheckRequired;
    private Date EffectivenessCheckCreationDate;
    private String EffectivenessCheckPlan;
    private String EffectivenessChecker;


}
