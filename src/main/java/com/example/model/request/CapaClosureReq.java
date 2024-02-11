package com.example.model.request;

import lombok.Data;

@Data
public class CapaClosureReq {
    private Long entityMainId;
    private Long id;
    private String QaReview;

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

    public String getQaReview() {
        return QaReview;
    }

    public void setQaReview(String qaReview) {
        QaReview = qaReview;
    }
}
