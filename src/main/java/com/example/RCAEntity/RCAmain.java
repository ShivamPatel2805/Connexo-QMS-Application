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
public class RCAmain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    @OneToMany(targetEntity = RCAInvestigation.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCAInvestigation_fk",referencedColumnName = "id")
    private List<RCAInvestigation> rCAInvestigation;

    @OneToMany(targetEntity = RCAGroupComments.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCAGroupComments_fk",referencedColumnName = "id")
    private List<RCAGroupComments> rCAGroupComments;

    @OneToMany(targetEntity = RCARootCause.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCARootCause_fk",referencedColumnName = "id")
    private List<RCARootCause> rCARootCause;

}
