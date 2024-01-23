package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.ExtentionGeneralInformation;
@Repository
public interface ExtentionGeneralInfoRepo extends JpaRepository<ExtentionGeneralInformation, Long>{

}
