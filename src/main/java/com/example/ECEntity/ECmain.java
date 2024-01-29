package com.example.ECEntity;

import com.example.ExternalAuditEntity.AuditRecord;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ECmain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    @OneToMany(targetEntity = ECGI.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ECGI_fk",referencedColumnName = "id")
    private List<ECGI> eCGI;

    @OneToMany(targetEntity = ECResult.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ECResult_fk",referencedColumnName = "id")
    private List<ECResult> eCResult;
}
