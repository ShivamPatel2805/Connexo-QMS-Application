package com.example.Repository.rootcauseanaylsis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.database.rootcauseanaylsis.QCHeadAttachments;

@Repository
public interface QCHeadAttachmentsRepo extends JpaRepository<QCHeadAttachments,Long> {
}
