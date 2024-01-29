package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ManagementReviewEntity.OperationPlanning;
@Repository
public interface OperationPlanningRepo extends JpaRepository<OperationPlanning, Long>{

}
