package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.ExtentionGeneralInfoAttach;
@Repository
public interface ExtentionGeneralInfoAttachRepo extends JpaRepository<ExtentionGeneralInfoAttach, Long> {

}
