package com.example.LabIncidentEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class QAReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String QaReviewComments;
    @OneToMany(targetEntity = QaHeadAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="QaHead_fk",referencedColumnName = "id")
    private List<QaHeadAttachment> qaHeadAttachments;

}
