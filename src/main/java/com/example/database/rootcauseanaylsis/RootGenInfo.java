package com.example.database.rootcauseanaylsis;

import com.google.gson.Gson;
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
public class RootGenInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recordNumber;
    private String initiator;
    private String assignedTo;
    private String initiatorGroup;
    private String shortDescription;
    private String sevrityLevel;
    private String initiatedThrough;
    private String repeats;
    private String problemDescription;
    private String capaTeam;
    private String referenceRecords;
    private String initialObservation;
    private String interimContainnment;
    private String containmentComments;
    private String locationCode;
    private Date dateofInitiation;
    private Date dueDate;
    private int initiatorGroupCode;
    private String others;
    private String repeatsNature;
    //private String CapaAttachment;
    // Assuming Many CapaGenInfo can belong to One EntityMain
    @Column(name = "rootCauseEntityMainId")
    private Long entityMainId;




    @OneToMany(targetEntity = RootGeneralInfoAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="rootGeneralInfoId",referencedColumnName = "id")
    private List<RootGeneralInfoAttach> rootGeneralInfoAttach;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getInitiatorGroup() {
        return initiatorGroup;
    }

    public void setInitiatorGroup(String initiatorGroup) {
        this.initiatorGroup = initiatorGroup;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSevrityLevel() {
        return sevrityLevel;
    }

    public void setSevrityLevel(String sevrityLevel) {
        this.sevrityLevel = sevrityLevel;
    }

    public String getInitiatedThrough() {
        return initiatedThrough;
    }

    public void setInitiatedThrough(String initiatedThrough) {
        this.initiatedThrough = initiatedThrough;
    }

    public String getRepeats() {
        return repeats;
    }

    public void setRepeats(String repeats) {
        this.repeats = repeats;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getCapaTeam() {
        return capaTeam;
    }

    public void setCapaTeam(String capaTeam) {
        this.capaTeam = capaTeam;
    }

    public String getReferenceRecords() {
        return referenceRecords;
    }

    public void setReferenceRecords(String referenceRecords) {
        this.referenceRecords = referenceRecords;
    }

    public String getInitialObservation() {
        return initialObservation;
    }

    public void setInitialObservation(String initialObservation) {
        this.initialObservation = initialObservation;
    }

    public String getInterimContainnment() {
        return interimContainnment;
    }

    public void setInterimContainnment(String interimContainnment) {
        this.interimContainnment = interimContainnment;
    }

    public String getContainmentComments() {
        return containmentComments;
    }

    public void setContainmentComments(String containmentComments) {
        this.containmentComments = containmentComments;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public Date getDateofInitiation() {
        return dateofInitiation;
    }

    public void setDateofInitiation(Date dateofInitiation) {
        this.dateofInitiation = dateofInitiation;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getInitiatorGroupCode() {
        return initiatorGroupCode;
    }

    public void setInitiatorGroupCode(int initiatorGroupCode) {
        this.initiatorGroupCode = initiatorGroupCode;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getRepeatsNature() {
        return repeatsNature;
    }

    public void setRepeatsNature(String repeatsNature) {
        this.repeatsNature = repeatsNature;
    }

    public List<RootGeneralInfoAttach> getRootGeneralInfoAttach() {
        return rootGeneralInfoAttach;
    }

    public void setRootGeneralInfoAttach(List<RootGeneralInfoAttach> RootGeneralInfoAttach) {
        this.rootGeneralInfoAttach = rootGeneralInfoAttach;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
