package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.Clouser;
@Repository
public interface ClouserRepo extends JpaRepository<Clouser, Long>{

}
