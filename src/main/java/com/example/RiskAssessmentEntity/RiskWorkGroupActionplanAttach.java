package com.example.RiskAssessmentEntity;

import com.example.InternalAuditEntity.InternalFileAttach;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskWorkGroupActionplanAttach {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long   id;
    private String action;
    private String responsiblePerson;
    private String deadline;
    private String itemStatic;
}
