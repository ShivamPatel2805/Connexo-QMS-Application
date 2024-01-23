package com.example.LabIncidentRepository;

import com.example.LabIncidentEntity.GeneralInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneralInfoRepository extends JpaRepository<GeneralInformation,Long> {
}
