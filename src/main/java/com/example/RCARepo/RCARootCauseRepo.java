package com.example.RCARepo;


import com.example.RCAEntity.RCARootCause;
import com.example.RCAEntity.RCAmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCARootCauseRepo extends JpaRepository<RCARootCause, Long>{
}
