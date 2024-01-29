package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.ClouserSecondGrid;
@Repository
public interface ClouserSecondGridRepo extends JpaRepository<ClouserSecondGrid, Long>{

}
