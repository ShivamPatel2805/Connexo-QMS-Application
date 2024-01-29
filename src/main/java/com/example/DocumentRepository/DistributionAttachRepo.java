package com.example.DocumentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DocumentEntity.DistributionAttach;
@Repository
public interface DistributionAttachRepo extends JpaRepository<DistributionAttach, Long>{

}
