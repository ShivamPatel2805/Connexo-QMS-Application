package com.example.ManagementReviewRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementReviewEntity.Meetings;
@Repository
public interface MeetingsRepo extends JpaRepository<Meetings, Long>{

}
