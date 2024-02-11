package com.example.database.rootcauseanaylsis;

//import QMS.QMS_Project.database.capaEntity.GroupCommentAttach;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.example.database.capaEntity.GroupAttach;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootCauseGroupComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long rootCauseEntityMain;

    private String CftComments;
    private String QaComments;
    private String WarehouseComments;
    private String InstrumentationComments;
    private String OthersComments;
    private String QaHeadDesigneeComments;
    private String EngineeringComments;
    private String ValidationComments;
    private String GroupComments;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRootCauseEntityMain() {
        return rootCauseEntityMain;
    }

    public void setRootCauseEntityMain(Long entityMainId) {
        this.rootCauseEntityMain = entityMainId;
    }

    public String getCftComments() {
        return CftComments;
    }

    public void setCftComments(String cftComments) {
        CftComments = cftComments;
    }

    public String getQaComments() {
        return QaComments;
    }

    public void setQaComments(String qaComments) {
        QaComments = qaComments;
    }

    public String getWarehouseComments() {
        return WarehouseComments;
    }

    public void setWarehouseComments(String warehouseComments) {
        WarehouseComments = warehouseComments;
    }

    public String getInstrumentationComments() {
        return InstrumentationComments;
    }

    public void setInstrumentationComments(String instrumentationComments) {
        InstrumentationComments = instrumentationComments;
    }

    public String getOthersComments() {
        return OthersComments;
    }

    public void setOthersComments(String othersComments) {
        OthersComments = othersComments;
    }

    public String getQaHeadDesigneeComments() {
        return QaHeadDesigneeComments;
    }

    public void setQaHeadDesigneeComments(String qaHeadDesigneeComments) {
        QaHeadDesigneeComments = qaHeadDesigneeComments;
    }

    public String getEngineeringComments() {
        return EngineeringComments;
    }

    public void setEngineeringComments(String engineeringComments) {
        EngineeringComments = engineeringComments;
    }

    public String getValidationComments() {
        return ValidationComments;
    }

    public void setValidationComments(String validationComments) {
        ValidationComments = validationComments;
    }

    public String getGroupComments() {
        return GroupComments;
    }

    public void setGroupComments(String groupComments) {
        GroupComments = groupComments;
    }

    public List<RootGroupCommentAttach> getRootGroupCommentsAttach() {
        return rootGroupCommentsAttach;
    }

    public void setRootGroupCommentsAttach(List<RootGroupCommentAttach> rootGroupCommentsAttach) {
        this.rootGroupCommentsAttach = rootGroupCommentsAttach;
    }

    public List<RootGroupAttach> getRootGroupAttach() {
        return rootGroupAttach;
    }

    public void setRootGroupAttach(List<RootGroupAttach> rootGroupAttach) {
        this.rootGroupAttach = rootGroupAttach;
    }

    @OneToMany(targetEntity = RootGroupCommentAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootGroupCommentsAttach_fk", referencedColumnName = "id")
    private List<RootGroupCommentAttach> rootGroupCommentsAttach;

    @OneToMany(targetEntity = RootGroupAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rootGroupCommentsAttach_fk", referencedColumnName = "id")
    private List<RootGroupAttach> rootGroupAttach;
}

