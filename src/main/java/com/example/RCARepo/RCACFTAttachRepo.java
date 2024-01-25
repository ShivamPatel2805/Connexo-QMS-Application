package com.example.RCARepo;


import com.example.RCAEntity.RCACFTAttach;
import com.example.RCAEntity.RCAmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCACFTAttachRepo extends JpaRepository<RCACFTAttach, Long>{
}
