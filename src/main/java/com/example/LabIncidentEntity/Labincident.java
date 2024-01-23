package com.example.LabIncidentEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Labincident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    @OneToMany(targetEntity = GeneralInformation.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="general_fk",referencedColumnName = "id")
    private List<GeneralInformation> generalInformation;

    @OneToMany(targetEntity = IncidentDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Incident_fk",referencedColumnName = "id")
    private List<IncidentDetails> incidentDetails;

    @OneToMany(targetEntity = InvestigationDetails.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Invest_fk",referencedColumnName = "id")
    private List<InvestigationDetails> investigationDetails;

    @OneToMany(targetEntity = Capa.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="Capa_fk",referencedColumnName = "id")
    private List<Capa> capa;

    @OneToMany(targetEntity = QAReview.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="QAReview_fk",referencedColumnName = "id")
    private List<QAReview> qaReviews;

    @OneToMany(targetEntity = QAHeadDesigneApprovel.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="QAHeadDes_fk",referencedColumnName = "id")
    private List<QAHeadDesigneApprovel> qaHeadDesigneApprovel;

}
