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
public class CapaClosure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String qaReview;
    private String effectivenessCheckRequired;
    private String effectivenessCheckPlan;
    private String dueDateExtensionJustification;

    @OneToMany(targetEntity = CapaClosureInfoAttach.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "capaClosureId", referencedColumnName = "id")
    private List<CapaClosureInfoAttach> capaClosureInfoAttach;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}