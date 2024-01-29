package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.OperationAttach;
@Repository
public interface OperationAttachRepo extends JpaRepository<OperationAttach, Long>{

}
