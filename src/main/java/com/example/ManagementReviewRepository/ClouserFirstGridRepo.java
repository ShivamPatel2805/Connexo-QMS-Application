package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.ClouserFirstGrid;
@Repository
public interface ClouserFirstGridRepo extends JpaRepository<ClouserFirstGrid, Long>{

}
