package com.example.ECRepo;

import com.example.ECEntity.ECResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ECResultRepo extends JpaRepository<ECResult, Long>{

}
