package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChangeDetailsAttachment;

@Repository
public interface ChangeDetailsAttachRepo extends JpaRepository<ChangeDetailsAttachment, Long>{

}
