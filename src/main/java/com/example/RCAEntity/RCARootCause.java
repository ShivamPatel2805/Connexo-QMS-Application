package com.example.RCAEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RCARootCause {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String RootCauseMethodology;
    private String RootCauseDescription;
    private String investigationSummary;
    private String zone;
    private String country;
    private String state;
    private String city;

    @OneToMany(targetEntity =RCARootCauseAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCARootCauseAttach_fk",referencedColumnName = "id")
    private List<RCARootCauseAttach> rCARootCauseAttach;

}
