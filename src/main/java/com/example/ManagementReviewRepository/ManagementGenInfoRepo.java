package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.ManagementGenInfo;
@Repository
public interface ManagementGenInfoRepo extends JpaRepository<ManagementGenInfo, Long>{

}
