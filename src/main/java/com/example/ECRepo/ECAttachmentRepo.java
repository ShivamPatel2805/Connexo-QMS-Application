package com.example.ECRepo;

import com.example.ECEntity.ECAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ECAttachmentRepo extends JpaRepository<ECAttachment, Long>{

}
