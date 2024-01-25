package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.MeetingsAttach;
@Repository
public interface MeetingsAttachRepo extends JpaRepository<MeetingsAttach, Long>{

}
