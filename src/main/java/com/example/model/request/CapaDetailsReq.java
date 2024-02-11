package com.example.model.request;

import lombok.Data;

@Data
public class CapaDetailsReq {
    private Long entityMainId;
    private Long id;
    private String capaType;
    private String correctiveAction;
    private String preventiveAction;
    private String supervisorReviewComments;

    public Long getEntityMainId() {
        return entityMainId;
    }

    public void setEntityMainId(Long entityMainId) {
        this.entityMainId = entityMainId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCapaType() {
        return capaType;
    }

    public void setCapaType(String capaType) {
        this.capaType = capaType;
    }

    public String getCorrectiveAction() {
        return correctiveAction;
    }

    public void setCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
    }

    public String getPreventiveAction() {
        return preventiveAction;
    }

    public void setPreventiveAction(String preventiveAction) {
        this.preventiveAction = preventiveAction;
    }

    public String getSupervisorReviewComments() {
        return supervisorReviewComments;
    }

    public void setSupervisorReviewComments(String supervisorReviewComments) {
        this.supervisorReviewComments = supervisorReviewComments;
    }
}
