package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.QaAppAttach;
@Repository
public interface QaAppAttachRepo extends JpaRepository<QaAppAttach, Long>{

}
