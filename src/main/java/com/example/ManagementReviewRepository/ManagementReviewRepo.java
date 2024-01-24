package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.ManagementReview;
@Repository
public interface ManagementReviewRepo extends JpaRepository<ManagementReview, Long>{

}
