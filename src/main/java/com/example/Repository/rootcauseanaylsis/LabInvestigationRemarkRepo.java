package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.LabInvestigatorConclusion;

@Repository
public interface LabInvestigationRemarkRepo extends JpaRepository<LabInvestigatorConclusion,Long> {
}
