package com.example.database.capaEntity;

import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Additional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isConcernedGroupReviewRequired;
    private String production;
    private String qualityApprover;
    private String others;
    private String productionPerson;
    private String qualityApproverPerson;
    private String othersPerson;
    private String cFTReviewRequired;
    private String cFTReviewerPerson;
    private String qaEvaluationComments;


    @OneToMany(targetEntity = AdditionalAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "additionalAttachId", referencedColumnName = "id")
    private List<AdditionalAttach> additionalAttach;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
