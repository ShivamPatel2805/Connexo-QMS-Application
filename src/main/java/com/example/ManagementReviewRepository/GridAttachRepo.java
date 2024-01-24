package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.InfoGridAttach;
@Repository
public interface GridAttachRepo extends JpaRepository<InfoGridAttach, Long>{

}
