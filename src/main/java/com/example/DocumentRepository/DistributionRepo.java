package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.Distribution;
@Repository
public interface DistributionRepo extends JpaRepository<Distribution, Long>{

}
