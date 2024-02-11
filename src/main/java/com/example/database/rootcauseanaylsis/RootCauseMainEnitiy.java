package com.example.database.rootcauseanaylsis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.example.database.capaEntity.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootCauseMainEnitiy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String divison;
    private String process;
    private Long startDate;
    private Long updateOnDate;
    private Long dueDate;
    private String securityLevel;
    private String shortDescription;
    private String assignTo;
    private String status;
    @Column
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getUpdateOnDate() {
        return updateOnDate;
    }

    public void setUpdateOnDate(Long updateOnDate) {
        this.updateOnDate = updateOnDate;
    }

    public Long getDueDate() {
        return dueDate;
    }

    public void setDueDate(Long dueDate) {
        this.dueDate = dueDate;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(String assignTo) {
        this.assignTo = assignTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @OneToMany(targetEntity = LabInvestigatorConclusion.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootCauseId", referencedColumnName = "id")
    private List<LabInvestigatorConclusion> labInvestigatorConclusions;

    @OneToMany(targetEntity = QAEvaluationComments.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootCauseId", referencedColumnName = "id")
    private List<QAEvaluationComments> qAEvaluationComments;

    @OneToMany(targetEntity = QCHeadEvaluationComments.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootCauseId", referencedColumnName = "id")
    private List<QCHeadEvaluationComments> qCHeadEvaluationComments;

    @OneToMany(targetEntity = RootAdditional.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootCauseId", referencedColumnName = "id")
    private List<RootAdditional> rootAdditionals;


    @OneToMany(targetEntity = RootCauseGroupComment.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootCauseId", referencedColumnName = "id")
    private List<RootCauseGroupComment> rootCauseGroupComments;

    @OneToMany(targetEntity = RootGenInfo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootCauseId", referencedColumnName = "id")
    private List<RootGenInfo> rootGenInfos;

}

