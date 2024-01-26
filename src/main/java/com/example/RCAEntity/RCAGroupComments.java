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
public class RCAGroupComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cftComments;
    private String qaComments;
    private String qaHeadDesignComments;
    private String warehouseComments;
    private String engineeringComments;
    private String instrumentationComments;
    private String validationComments;
    private String othersComments;
    private String groupComments;
    @OneToMany(targetEntity = RCACFTAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCACFTAttach_fk",referencedColumnName = "id")
    private List<RCACFTAttach> rCACFTAttach;

    @OneToMany(targetEntity = RCAGroupAttach.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="RCAGroupAttach_fk",referencedColumnName = "id")
    private List<RCAGroupAttach> rCAGroupAttach;

}
