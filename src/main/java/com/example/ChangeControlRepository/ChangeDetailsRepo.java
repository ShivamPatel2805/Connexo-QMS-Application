package com.example.ChangeControlRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ChangeControlEntity.ChangeDetails;

@Repository
public interface ChangeDetailsRepo extends JpaRepository<ChangeDetails, Long>{

}
