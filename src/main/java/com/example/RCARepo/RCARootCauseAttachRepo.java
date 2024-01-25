package com.example.RCARepo;


import com.example.RCAEntity.RCARootCauseAttach;
import com.example.RCAEntity.RCAmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCARootCauseAttachRepo extends JpaRepository<RCARootCauseAttach, Long>{
}
