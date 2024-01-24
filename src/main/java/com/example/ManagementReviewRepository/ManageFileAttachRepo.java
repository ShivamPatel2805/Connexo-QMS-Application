package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.ManageFileAttach;
@Repository
public interface ManageFileAttachRepo extends JpaRepository<ManageFileAttach, Long>{

}
