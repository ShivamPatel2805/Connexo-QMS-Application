package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.QAEvolutionAttachments;

@Repository
public interface QAEvolutionAttachmentsRepo extends JpaRepository<QAEvolutionAttachments,Long> {
}
