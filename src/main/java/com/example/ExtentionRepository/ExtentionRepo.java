package com.example.ExtentionRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExtentionEntity.Extention;
@Repository
public interface ExtentionRepo extends JpaRepository<Extention, Long>{

}
