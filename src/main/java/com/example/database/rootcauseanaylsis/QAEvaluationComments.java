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
public class QAEvaluationComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(targetEntity = QAEvolutionAttachments.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="qAEvolutionAttachmentsId",referencedColumnName = "id")
    private List<QAEvolutionAttachments> qaAttech;
}
