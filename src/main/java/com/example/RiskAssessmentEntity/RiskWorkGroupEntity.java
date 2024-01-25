package com.example.RiskAssessmentEntity;

import com.example.InternalAuditEntity.InternalFileAttach;
import com.example.InternalAuditEntity.InternalGuidelineAttach;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Timer;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskWorkGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date scheduledStartDate;
    private Date scheduleEndDate;
    private Time estimateManHours;
    private String estimateCost;
    private String currency;
    private String justification;


    @OneToMany(targetEntity = RiskWorkGroupActionplanAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskWorkGroupActionplanAttach_fk",referencedColumnName = "id")
    private List<RiskWorkGroupActionplanAttach> riskWorkGroupActionplanAttaches;

    @OneToMany(targetEntity = RiskWorkGroupAttachFile.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RiskWorkGroupAttachFile_fk",referencedColumnName = "id")
    private List<RiskWorkGroupAttachFile> riskWorkGroupAttachFiles;

}
