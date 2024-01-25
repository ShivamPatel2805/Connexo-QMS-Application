package com.example.ECEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ECResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String eSummary;
    private String eResults;
    private String addendumComments;
    @OneToMany(targetEntity = ECAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ECAttachment_fk",referencedColumnName = "id")
    private List<ECAttachment> eCAttachment;

    @OneToMany(targetEntity = AddendumAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="AddendumAttachment_fk",referencedColumnName = "id")
    private List<AddendumAttachment> addendumAttachment;
}
