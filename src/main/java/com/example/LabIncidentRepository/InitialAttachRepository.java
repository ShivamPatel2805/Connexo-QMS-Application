package com.example.LabIncidentRepository;

import com.example.LabIncidentEntity.InitialAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitialAttachRepository extends JpaRepository<InitialAttachment,Long> {
}
