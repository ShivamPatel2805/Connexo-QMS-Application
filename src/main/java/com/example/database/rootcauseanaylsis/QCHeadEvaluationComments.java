package com.example.database.rootcauseanaylsis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QCHeadEvaluationComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String qAEvaluationComments;
    private String qAComments;
    private String qAHeadDesigneeComments;
    private String warehouseComments;
    private String engineeringComments;
    private String instrumentationComments;
    private String groupComments;
    private String othersComments;
    private String validationComments;


    @OneToMany(targetEntity = QCHeadAttachments.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="qCHeadEvaluationCommentsId",referencedColumnName = "id")
    private List<QCHeadAttachments> qcHeadAttachments;


}
