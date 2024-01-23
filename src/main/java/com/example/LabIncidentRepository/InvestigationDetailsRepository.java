package com.example.LabIncidentRepository;

import com.example.LabIncidentEntity.InvestigationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestigationDetailsRepository  extends JpaRepository<InvestigationDetails,Long> {
}
