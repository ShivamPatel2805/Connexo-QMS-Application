package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.ExtentionGeneralInfoGridAttach;
@Repository
public interface ExtentionGeneralInfoGridAttachRepo extends JpaRepository<ExtentionGeneralInfoGridAttach, Long>{

}
