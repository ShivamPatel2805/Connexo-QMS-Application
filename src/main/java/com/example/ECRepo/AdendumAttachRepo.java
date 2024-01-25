package com.example.ECRepo;

import com.example.ECEntity.AddendumAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdendumAttachRepo extends JpaRepository<AddendumAttachment, Long>{

}
