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
public class IncidentDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String IncidentDetails;
  private String DocumentDetails;
  private String InstrumentDetails;
  private String InvolvedPersonnel;
  private String ProductDetails;
  private String SupervisorReviewComments;

  @OneToMany(targetEntity = IncidentAttach.class,cascade = CascadeType.ALL)
  @JoinColumn(name ="Incident_fk",referencedColumnName = "id")
  private List<IncidentAttach> incidentAttach;

}
