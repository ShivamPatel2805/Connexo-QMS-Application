package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.QaApprovalGridAttach;
@Repository
public interface QaApprovalGridRepo extends JpaRepository<QaApprovalGridAttach,Long>{

}
