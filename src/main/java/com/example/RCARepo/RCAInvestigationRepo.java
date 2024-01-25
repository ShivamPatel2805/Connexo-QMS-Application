package com.example.RCARepo;


import com.example.RCAEntity.RCAInvestigation;
import com.example.RCAEntity.RCAmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCAInvestigationRepo extends JpaRepository<RCAInvestigation, Long>{
}
