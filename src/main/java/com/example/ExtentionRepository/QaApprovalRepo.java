package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.QaApproval;
@Repository
public interface QaApprovalRepo extends JpaRepository<QaApproval, Long>{

}
