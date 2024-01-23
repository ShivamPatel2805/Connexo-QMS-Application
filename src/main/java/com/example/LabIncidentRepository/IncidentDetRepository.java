package com.example.LabIncidentRepository;

import com.example.LabIncidentEntity.IncidentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentDetRepository extends JpaRepository<IncidentDetails,Long> {
}
