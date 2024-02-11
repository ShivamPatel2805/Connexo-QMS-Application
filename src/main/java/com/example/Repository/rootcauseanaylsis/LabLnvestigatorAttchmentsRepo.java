package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.LabInvestigatorAttachments;

@Repository
public interface LabLnvestigatorAttchmentsRepo extends JpaRepository<LabInvestigatorAttachments,Long> {
}
