package com.example.RCARepo;


import com.example.RCAEntity.RCAInitialAttach;
import com.example.RCAEntity.RCAmain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCAInitialAttachRepo extends JpaRepository<RCAInitialAttach, Long>{
}
