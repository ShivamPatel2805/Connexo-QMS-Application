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
public class Capa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String InvestigationDetail;
   private String ActionTaken;
    @OneToMany(targetEntity = CapaAttachment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="CapaAttach_fk",referencedColumnName = "id")
    private List<CapaAttachment> capaAttachment;

}
