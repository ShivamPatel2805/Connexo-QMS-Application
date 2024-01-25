package com.example.CapaEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CapaClosure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String QaReview;
    //private String ClosureAttachment;

    @OneToMany(targetEntity = CapaClosureInfoAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "CapaClosure_fk", referencedColumnName = "id")
    private List<CapaClosureInfoAttach> capaClosureInfoAttach;


}
