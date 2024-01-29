package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.ClouserFileAttach;
@Repository
public interface ClouserFileAttachRepo extends JpaRepository<ClouserFileAttach, Long>{

}
